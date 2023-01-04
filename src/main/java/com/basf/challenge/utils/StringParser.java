package com.basf.challenge.utils;


import com.basf.challenge.exception.ParserException;

import java.util.Arrays;

public class StringParser {
    private static byte[] illegalXMLChars;
    private String html = null;
    private StringBuffer source = null;
    public int iniStr = 0;
    public int endStr = 0;
    protected int fieldSeparator = 1;
    private String method = "";
    private int iniMark = 0;
    private int endMark = 0;

    public StringParser(String html) {
        this.html = this.cleanStringForXml(html);
        this.source = new StringBuffer(html);
    }

    public StringParser() {
    }

    public void setString(String html) {
        this.html = this.cleanStringForXml(html);
        this.iniStr = 0;
        this.endStr = 0;
        this.fieldSeparator = 1;
    }

    public String getString() {
        return this.html;
    }

    public String toString() {
        return this.html;
    }

    private String cleanStringForXml(String pString) {
        byte bReplacement = 32;
        byte[] bytes = pString.getBytes();

        for (int i = 0; i < bytes.length; ++i) {
            byte aByte = bytes[i];
            if (Arrays.binarySearch(illegalXMLChars, aByte) >= 0) {
                bytes[i] = bReplacement;
            }
        }

        return new String(bytes);
    }

    public String _nextToken(String searchFor, int times, String searchStop, boolean forward) throws ParserException {
        String method = "StringParser.nextToken( " + searchFor + ", " + times + ", " + searchStop + ", " + forward + " ): ";

        try {
            if (times < 1) {
                throw new ParserException();
            } else if (searchFor == null) {
                throw new ParserException();
            } else {
                int i;
                if (forward) {
                    this.iniStr = this.endStr;

                    for (i = 0; i < times; ++i) {
                        this.iniStr = this.html.indexOf(searchFor, this.iniStr);
                        if (this.iniStr < 0) {
                            throw new ParserException(method, searchFor + " was only found " + i + " times from the current position.");
                        }

                        this.iniStr += searchFor.length();
                    }

                    if (searchStop == null) {
                        this.endStr = this.html.length();
                    } else {
                        this.endStr = this.html.indexOf(searchStop, this.iniStr);
                        if (this.endStr < 0) {
                            throw new ParserException(method, " SearchStop not found after " + times + " times of " + searchFor + " from the current position.");
                        }
                    }
                } else {
                    for (i = 0; i < times; ++i) {
                        this.endStr = this.html.indexOf(searchFor, this.endStr + searchFor.length());
                        if (this.endStr < 0) {
                            throw new ParserException(method, searchFor + " was only found " + i + " times from the current position.");
                        }
                    }

                    if (searchStop == null) {
                        this.iniStr = 0;
                    } else {
                        this.iniStr = this.html.lastIndexOf(searchStop, this.endStr);
                        if (this.iniStr < 0) {
                            throw new ParserException(method, " SearchStop not found backward after " + times + " times of " + searchFor + " from the current position.");
                        }

                        this.iniStr += searchStop.length();
                    }
                }

                return this.html.substring(this.iniStr, this.endStr);
            }
        } catch (ParserException var8) {
            throw var8;
        }
    }

    public String nextToken(String searchFor, int times, String searchStop, boolean forward, boolean trim) throws ParserException {
        String result = null;
        result = this._nextToken(searchFor, times, searchStop, forward);
        return trim ? result.trim() : result;
    }

    public String nextToken(String searchFor, int times, String searchStop, boolean forward) throws ParserException {
        String result = null;
        result = this._nextToken(searchFor, times, searchStop, forward);
        return result.trim();
    }

    public String nextTokenTo(String searched, boolean forward) throws Exception {
        String method = "StringParser.nextTokenTo( " + searched + ", " + forward + " ): ";

        try {
            if (forward) {
                this.iniStr = this.endStr + this.fieldSeparator;
                this.endStr = this.html.indexOf(searched, this.iniStr);
                if (this.endStr < 0) {
                    throw new ParserException(method, searched + " not found after current position + " + this.fieldSeparator + " characters.");
                }
            } else {
                this.endStr = this.iniStr - this.fieldSeparator;
                this.iniStr = this.html.lastIndexOf(searched, this.endStr);
                if (this.iniStr < 0) {
                    throw new ParserException(method, searched + " not found before current position - " + this.fieldSeparator + " characters.");
                }

                this.iniStr += searched.length();
            }

            return this.html.substring(this.iniStr, this.endStr).trim();
        } catch (ParserException var5) {
            throw var5;
        } catch (Exception var6) {
            throw new Exception(method + var6);
        }
    }

    public String closingTo(String searched, boolean forward) throws Exception {
        String method = "StringParser.closingTo( " + searched + ", " + forward + " ): ";

        try {
            if (forward) {
                this.endStr = this.html.indexOf(searched, this.iniStr);
                if (this.endStr < 0) {
                    throw new ParserException(method, searched + " not found after current initial position ");
                }
            } else {
                this.iniStr = this.html.lastIndexOf(searched, this.endStr);
                if (this.iniStr < 0) {
                    throw new ParserException(method, searched + " not found before current ending position ");
                }

                this.iniStr += searched.length();
            }

            return this.html.substring(this.iniStr, this.endStr).trim();
        } catch (ParserException var5) {
            throw var5;
        } catch (Exception var6) {
            throw new Exception(method + var6);
        }
    }

    /**
     * @deprecated
     */
    public boolean afterToken(String searched) throws Exception {
        String method = "StringParser.afterToken( " + searched + " ): ";
        boolean tokenEncontrado = false;

        try {
            int tempEndStr = this.html.indexOf(searched, this.endStr);
            tokenEncontrado = tempEndStr >= 0;
            if (tokenEncontrado) {
                this.endStr = tempEndStr + searched.length();
                this.iniStr = this.endStr;
            }

            return tokenEncontrado;
        } catch (Exception var5) {
            throw new Exception(method + var5);
        }
    }

    /**
     * @deprecated
     */
    public boolean beforeToken(String searched) throws Exception {
        String method = "StringParser.beforeToken( " + searched + " ): ";

        try {
            this.endStr = this.html.indexOf(searched, this.endStr);
            if (this.endStr >= 0) {
                this.iniStr = this.endStr;
                return true;
            } else {
                return false;
            }
        } catch (Exception var4) {
            throw new Exception(method + var4);
        }
    }

    /**
     * @deprecated
     */
    public boolean afterToken(String searched, int times) throws Exception {
        String method = "StringParser.afterToken( " + searched + ", " + times + " ): ";
        boolean hayToken = false;

        try {
            for (int i = 0; i < times; ++i) {
                int tempEndStr = this.html.indexOf(searched, this.endStr);
                hayToken = tempEndStr >= 0;
                if (hayToken) {
                    this.endStr = tempEndStr + searched.length();
                    this.iniStr = this.endStr;
                }
            }

            return hayToken;
        } catch (Exception var7) {
            throw new Exception(method + var7);
        }
    }

    public String nextRelativeToken(String searchRef, String searchFor, int times, String searchStop, boolean forward) throws Exception {
        String method = "StringParser.nextRelativeToken( " + searchRef + ", " + searchFor + ", " + times + ", " + searchStop + ", " + forward + " ): ";

        try {
            if (times < 1) {
                throw new Exception(method + "times must be at least 1.");
            } else if (searchRef == null) {
                return this.nextToken(searchFor, times, searchStop, forward);
            } else {
                int i;
                if (forward) {
                    this.iniStr = this.html.indexOf(searchRef, this.endStr + 1);
                    if (this.iniStr < 0) {
                        throw new ParserException(method, searchRef + " Not found from the current position");
                    }

                    this.iniStr += searchRef.length();

                    for (i = 0; i < times; ++i) {
                        this.iniStr = this.html.indexOf(searchFor, this.iniStr);
                        if (this.iniStr < 0) {
                            throw new ParserException(method, searchFor + " was only found " + i + " times from " + searchRef);
                        }

                        this.iniStr += searchFor.length();
                    }

                    if (searchStop == null) {
                        this.endStr = this.html.length();
                    } else {
                        this.endStr = this.html.indexOf(searchStop, this.iniStr);
                        if (this.endStr < 0) {
                            throw new ParserException(method, searchStop + " not found after " + times + " times of " + searchFor + " from " + searchRef);
                        }
                    }
                } else {
                    this.endStr = this.iniStr;
                    this.endStr = this.html.indexOf(searchRef, this.endStr);
                    if (this.endStr < 0) {
                        throw new ParserException(method, searchRef + " Not found from the current position");
                    }

                    this.endStr += searchRef.length();
                    if (searchFor != null) {
                        for (i = 0; i < times; ++i) {
                            this.endStr = this.html.indexOf(searchFor, this.endStr + searchFor.length());
                            if (this.endStr < 0) {
                                throw new ParserException(method, searchFor + " was only found " + i + " times from " + searchRef);
                            }
                        }
                    }

                    if (searchStop == null) {
                        this.iniStr = 0;
                    } else {
                        this.iniStr = this.html.lastIndexOf(searchStop, this.endStr);
                        if (this.iniStr < 0) {
                            throw new ParserException(method, searchStop + " not found backward after " + times + " times of " + searchFor + " from " + searchRef);
                        }

                        this.iniStr += searchStop.length();
                    }
                }

                return this.html.substring(this.iniStr, this.endStr).trim();
            }
        } catch (Exception var8) {
            throw var8;
        }
    }

    public String prevRelativeToken(String searchRef, String searchFor, int times, String searchStop, boolean forward) throws Exception {
        String method = "StringParser.prevRelativeToken( " + searchRef + ", " + searchFor + ", " + times + ", " + searchStop + ", " + forward + " ): ";

        try {
            if (times < 1) {
                throw new Exception(method + "times must be at least 1.");
            } else if (searchRef == null) {
                return this.nextToken(searchFor, times, searchStop, forward);
            } else {
                int i;
                if (forward) {
                    this.iniStr = this.html.indexOf(searchRef, this.endStr + 1);
                    if (this.iniStr < 0) {
                        throw new ParserException(method, searchRef + " Not found from the current position");
                    }

                    for (i = 0; i < times; ++i) {
                        this.iniStr = this.html.lastIndexOf(searchFor, this.iniStr - searchFor.length());
                        if (this.iniStr < 0) {
                            throw new ParserException(method, searchFor + " was only found " + i + " times backward from " + searchRef);
                        }
                    }

                    this.iniStr += searchFor.length();
                    if (searchStop == null) {
                        this.endStr = this.html.length();
                    } else {
                        this.endStr = this.html.indexOf(searchStop, this.iniStr);
                        if (this.endStr < 0) {
                            throw new ParserException(method, searchStop + " not found after " + times + " times of " + searchFor + " from " + searchRef);
                        }
                    }
                } else {
                    this.endStr = this.iniStr;
                    this.endStr = this.html.indexOf(searchRef, this.endStr);
                    if (this.endStr < 0) {
                        throw new ParserException(method, searchRef + " Not found from the current position");
                    }

                    if (searchFor != null) {
                        for (i = 0; i < times; ++i) {
                            this.endStr = this.html.lastIndexOf(searchFor, this.endStr - searchFor.length());
                            if (this.endStr < 0) {
                                throw new ParserException(method, searchFor + " was only found " + i + " times backward from " + searchRef);
                            }
                        }
                    }

                    if (searchStop == null) {
                        this.iniStr = 0;
                    } else {
                        this.iniStr = this.html.lastIndexOf(searchStop, this.endStr);
                        if (this.iniStr < 0) {
                            throw new ParserException(method, searchStop + " not found backward after " + times + " times of " + searchFor + " from " + searchRef);
                        }

                        this.iniStr += searchStop.length();
                    }
                }

                return this.html.substring(this.iniStr, this.endStr).trim();
            }
        } catch (Exception var8) {
            throw var8;
        }
    }

    protected void position(String reference, String search, int times, boolean forward, boolean initial) throws Exception {
        String method = "StringParser.position( " + reference + ", " + search + ", " + times + ", " + forward + ", " + initial + " ): ";
        int tempStr = this.endStr + 1;

        try {
            if (times < 1) {
                throw new Exception(method + "times must be greater than 1 ");
            } else if (reference == null) {
                throw new Exception(method + "reference can not be null ");
            } else {
                int i;
                if (forward) {
                    tempStr = this.html.indexOf(reference, tempStr);
                    if (tempStr < 0) {
                        throw new ParserException(method, reference + " Not found from the current position");
                    }

                    tempStr += reference.length();

                    for (i = 0; i < times; ++i) {
                        tempStr = this.html.indexOf(search, tempStr);
                        if (tempStr < 0) {
                            throw new ParserException(method, search + " was only found " + i + " times from " + reference);
                        }

                        tempStr += search.length();
                    }
                } else {
                    tempStr = this.html.indexOf(reference, tempStr);
                    if (tempStr < 0) {
                        throw new ParserException(method, reference + " Not found from the current position");
                    }

                    for (i = 0; i < times; ++i) {
                        tempStr = this.html.lastIndexOf(search, tempStr) - 1;
                        if (tempStr < 0) {
                            throw new ParserException(method, search + " was only found backward " + i + " times from " + reference);
                        }
                    }

                    tempStr += search.length();
                }

                if (initial) {
                    this.iniStr = tempStr;
                } else {
                    this.endStr = tempStr - search.length();
                }

            }
        } catch (Exception var9) {
            throw var9;
        }
    }

    public String nextRelativeToken(String referenceBegin, String searchBegin, int timesBegin, boolean forwardBegin, String referenceAfter, String searchAfter, int timesAfter, boolean forwardAfter) throws Exception {
        this.position(referenceBegin, searchBegin, timesBegin, forwardBegin, true);
        this.endStr = this.iniStr;
        this.position(referenceAfter, searchAfter, timesAfter, forwardAfter, false);
        return this.html.substring(this.iniStr, this.endStr).trim();
    }

    public String parseToken(String searchFor, String searchStop) throws ParserException {
        this.reset();
        return this.nextToken(searchFor, 1, searchStop, true);
    }

    public String _prevToken(String searchFor, int times, String searchStop, boolean forward) throws Exception {
        String method = "StringParser.prevToken( " + searchFor + ", " + times + ", " + searchStop + ", " + forward + " ): ";

        try {
            if (times < 1) {
                throw new Exception(method + "times must be at least 1.");
            } else if (searchFor == null) {
                throw new Exception(method + "searchFor can not be null.");
            } else {
                int i;
                if (forward) {
                    for (i = 0; i < times; ++i) {
                        this.iniStr = this.html.lastIndexOf(searchFor, this.iniStr);
                        if (this.iniStr < 0) {
                            throw new ParserException(method, searchFor + " was only found " + i + " times from the current position.");
                        }
                    }

                    this.iniStr += searchFor.length();
                    if (searchStop == null) {
                        this.endStr = this.html.length();
                    } else {
                        this.endStr = this.html.indexOf(searchStop, this.iniStr);
                        if (this.endStr < 0) {
                            throw new ParserException(method, " SearchStop not found after " + times + " times of " + searchFor + " from the current position.");
                        }
                    }
                } else {
                    this.endStr = this.iniStr;

                    for (i = 0; i < times; ++i) {
                        this.endStr = this.html.lastIndexOf(searchFor, this.endStr);
                        if (this.endStr < 0) {
                            throw new ParserException(method, searchFor + " was only found " + i + " times from the current position.");
                        }
                    }

                    if (searchStop == null) {
                        this.iniStr = 0;
                    } else {
                        this.iniStr = this.html.lastIndexOf(searchStop, this.endStr);
                        if (this.iniStr < 0) {
                            throw new ParserException(method, " SearchStop not found backward after " + times + " times of " + searchFor + " from the current position.");
                        }

                        this.iniStr += searchStop.length();
                    }
                }

                return this.html.substring(this.iniStr, this.endStr);
            }
        } catch (Exception var7) {
            throw var7;
        }
    }

    public String prevToken(String searchFor, int times, String searchStop, boolean forward, boolean trim) throws Exception {
        String result = null;
        result = this._prevToken(searchFor, times, searchStop, forward);
        return trim ? result.trim() : result;
    }

    public String prevToken(String searchFor, int times, String searchStop, boolean forward) throws Exception {
        String result = null;
        result = this._prevToken(searchFor, times, searchStop, forward);
        return result.trim();
    }

    public void reset() {
        this.iniStr = 0;
        this.endStr = 0;
    }

    public void setSeparator(int value) {
        this.fieldSeparator = value;
    }

    public void mark() {
        this.iniMark = this.iniStr;
        this.endMark = this.endStr;
    }

    public void goMark() {
        this.iniStr = this.iniMark;
        this.endStr = this.endMark;
    }

    public String getRemnantString() {
        return this.html.substring(this.iniStr);
    }

    public String prevWord() throws Exception {
        String method = "StringParser.prevWord(): ";

        try {
            for (this.endStr = this.iniStr - 1; this.endStr > 0 && this.source.charAt(this.endStr) == ' '; --this.endStr) {
            }

            if (this.endStr <= 0) {
                throw new ParserException(method, "there is not any other word before current position.");
            } else {
                this.iniStr = this.html.lastIndexOf(" ", this.endStr);
                if (this.iniStr < 0) {
                    this.iniStr = -1;
                }

                ++this.iniStr;
                return this.html.substring(this.iniStr, this.endStr + 1);
            }
        } catch (ParserException var3) {
            throw var3;
        } catch (Exception var4) {
            throw new Exception(method + var4);
        }
    }

    public String prevWord(int times) throws ParserException {
        String method = "StringParser.prevWord( int" + times + " ): ";
        String result = null;

        try {
            if (times < 1) {
                throw new Exception(method + " times must be greater than 0");
            } else {
                for (int i = 0; i < times; ++i) {
                    result = this.prevWord();
                }

                return result;
            }
        } catch (ParserException var5) {
            throw var5;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String nextWord() throws Exception {
        String method = "StringParser.nextWord(): ";

        try {
            this.iniStr = this.endStr;

            while (this.iniStr < this.html.length() && this.source.charAt(this.iniStr++) == ' ') {
                if (this.iniStr == this.html.length()) {
                    throw new ParserException(method, "there is not any other word after current position");
                }
            }

            this.endStr = this.html.indexOf(" ", this.iniStr);
            if (this.endStr < 0) {
                this.iniStr = this.html.length() + 1;
            }

            --this.iniStr;
            return this.html.substring(this.iniStr, this.endStr);
        } catch (ParserException var3) {
            throw var3;
        } catch (Exception var4) {
            throw new Exception(method + var4);
        }
    }

    public String nextWord(int times) throws Exception {
        String method = "StringParser.nextWord( int" + times + " ): ";
        String result = null;

        try {
            if (times < 1) {
                throw new Exception(method + " times must be greater than 0");
            } else {
                for (int i = 0; i < times; ++i) {
                    result = this.nextWord();
                }

                return result;
            }
        } catch (ParserException var5) {
            throw var5;
        } catch (Exception var6) {
            throw var6;
        }
    }

    public String n_nextToken(String searchFor, int times, String searchStop, boolean forward, boolean trim) throws ParserException {
        this.method = "StringParserExt.nextToken(\"" + searchFor + "\", " + times + ", \"" + searchStop + "\", " + forward + ", " + times + ", " + trim + "):";
        if (!this.findChunk(searchFor, times, true, true, !forward)) {
            throw new ParserException(this.method, "<<searchFor no encontrado>>");
        } else if (!this.findChunk(searchStop, 1, forward, false, false)) {
            throw new ParserException(this.method, "<<searchStop no encontrado>>");
        } else {
            return this.getChunk(trim);
        }
    }

    public String n_nextToken(String searchFor, int times, String searchStop, boolean forward) throws ParserException {
        return this.n_nextToken(searchFor, times, searchStop, forward, false);
    }

    public String n_nextTokenTo(String searched, boolean forward) throws ParserException {
        this.method = "StringParserExt.nextTokenTo(\"" + searched + "\", " + forward + "):";
        if (forward) {
            this.iniStr = this.endStr + this.fieldSeparator;
        } else {
            this.endStr = this.iniStr - this.fieldSeparator;
        }

        String result = this.n_closingTo(searched, forward);
        return result;
    }

    public String n_closingTo(String searched, boolean forward) throws ParserException {
        this.method = "StringParserExt.closingTo(\"" + searched + "\", " + forward + "): ";
        return this.n_closingTo(searched, forward, false);
    }

    /**
     * @deprecated
     */
    public boolean n_afterToken(String searched, int times) throws ParserException {
        this.method = "StringParserExt.afterToken(\"" + searched + "\", " + times + "): ";
        boolean result = this.findChunk(searched, times, true, true, false);
        this.endStr = this.iniStr;
        return result;
    }

    /**
     * @deprecated
     */
    public boolean n_afterToken(String searched) throws ParserException {
        this.method = "StringParserExt.afterToken(\"" + searched + "\" ): ";
        return this.n_afterToken(searched, 1);
    }

    /**
     * @deprecated
     */
    public boolean n_beforeToken(String searched, int times) throws ParserException {
        this.method = "StringParserExt.beforeToken(\"" + searched + "\"): ";
        boolean result = this.findChunk(searched, 1, true, true, true);
        this.endStr = this.iniStr;
        return result;
    }

    /**
     * @deprecated
     */
    public boolean n_beforeToken(String searched) throws ParserException {
        this.method = "StringParserExt.beforeToken(\"" + searched + "\"): ";
        return this.n_beforeToken(searched, 1);
    }

    public String n_prevRelativeToken(String searchRef, String searchFor, int times, String searchStop, boolean forward) throws ParserException {
        String method = "StringParser.prevRelativeToken( " + searchRef + ", " + searchFor + ", " + times + ", " + searchStop + ", " + forward + " ): ";
        if (!this.findChunk(searchRef, 1, true, true, true)) {
            throw new ParserException(method, "<<searchRef no encontrado>>");
        } else if (!this.findChunk(searchFor, times, false, true, !forward)) {
            throw new ParserException(method, "<<searchFor no encontrado>>");
        } else if (!this.findChunk(searchStop, 1, forward, false, !forward)) {
            throw new ParserException(method, "<<searchStop no encontrado>>");
        } else {
            return this.getChunk(false);
        }
    }

    public String n_nextRelativeToken(String searchRef, String searchFor, int times, String searchStop, boolean forward) throws ParserException {
        this.method = "StringParserExt.nextRelativeToken(\"" + searchRef + "\", \"" + searchFor + "\", \"" + times + "\", \"" + searchStop + "\", " + forward + " ): ";
        if (!this.findChunk(searchRef, 1, true, true, false)) {
            throw new ParserException(this.method, "<<searchRef no encontrado>>");
        } else if (!this.findChunk(searchFor, times, true, true, !forward)) {
            throw new ParserException(this.method, "<<searchFor no encontrado>>");
        } else if (!this.findChunk(searchStop, 1, forward, false, false)) {
            throw new ParserException(this.method, "<<searchStop no encontrado>>");
        } else {
            return this.getChunk(false);
        }
    }

    public String n_nextRelativeToken(String referenceBegin, String searchBegin, int timesBegin, boolean forwardBegin, String referenceAfter, String searchAfter, int timesAfter, boolean forwardAfter) throws ParserException {
        this.method = "StringParserExt.nextRelativeToken( " + referenceBegin + ", " + searchBegin + ", " + timesBegin + ", " + forwardBegin + referenceAfter + ", " + searchAfter + ", " + timesAfter + ", " + forwardAfter + " ): ";
        if (!this.findChunk(referenceBegin, 1, true, true, !forwardBegin)) {
            throw new ParserException(this.method, "<<referenceBegin no encontrado>>");
        } else if (!this.findChunk(searchBegin, timesBegin, forwardBegin, true, false)) {
            throw new ParserException(this.method, "<<searchBegin no encontrado>>");
        } else {
            int aIniStr = this.iniStr;
            if (!this.findChunk(referenceAfter, 1, true, true, !forwardAfter)) {
                throw new ParserException(this.method, "<<referenceAfter no encontrado>>");
            } else if (!this.findChunk(searchAfter, timesAfter, forwardAfter, false, false)) {
                throw new ParserException(this.method, "<<searchAfter no encontrado>>");
            } else {
                this.iniStr = aIniStr;
                return this.getChunk(false);
            }
        }
    }

    public String n_parseToken(String searchFor, String searchStop) throws ParserException {
        this.n_reset();
        if (!this.findChunk(searchFor, 1, true, true, false)) {
            throw new ParserException(this.method, "<<searchFor no encontrado>>");
        } else if (!this.findChunk(searchStop, 1, true, false, false)) {
            throw new ParserException(this.method, "<<searchStop no encontrado>>");
        } else {
            return this.getChunk(true);
        }
    }

    public String n_prevToken(String searchFor, int times, String searchStop, boolean forward, boolean trim) throws ParserException {
        this.method = "StringParserExt.prevToken(\"" + searchFor + "\", " + times + ", \"" + searchStop + "\", " + forward + ", " + trim + "):";
        if (!this.findChunk(searchFor, times, false, true, !forward)) {
            throw new ParserException(this.method, "<<searchFor no encontrado>>");
        } else if (!this.findChunk(searchStop, 1, forward, false, !forward)) {
            throw new ParserException(this.method, "<<searchStop no encontrado>>");
        } else {
            return this.getChunk(trim);
        }
    }

    public String n_prevToken(String searchFor, int times, String searchStop, boolean forward) throws ParserException {
        return this.n_prevToken(searchFor, times, searchStop, forward, false);
    }

    public void n_reset() {
        this.iniStr = 0;
        this.endStr = 0;
    }

    public void n_setSeparator(int value) {
        this.fieldSeparator = value;
    }

    public void n_goMark() {
        this.iniStr = this.iniMark;
        this.endStr = this.endMark;
    }

    public void n_mark() {
        this.iniMark = this.iniStr;
        this.endMark = this.endStr;
    }

    public String n_prevWord() throws ParserException {
        this.method = "StringParserExt.prevWord(): ";
        int ini = this.iniStr;
        if (ini < this.html.length() - 2 & this.html.charAt(ini) != ' ' && this.html.charAt(ini + 1) != ' ') {
            ini = this.html.lastIndexOf(" ", ini);
        }

        if (ini >= 0 && ini <= this.html.length()) {
            int end;
            for (end = ini - 1; (end = this.html.lastIndexOf(" ", end)) > -1 && this.html.charAt(end - 1) == ' '; --end) {
            }

            if (end < 0) {
                if (this.html.charAt(0) == ' ') {
                    throw new ParserException(this.method, "<<palabra no encontrada>>");
                }

                end = 0;
            }

            this.iniStr = ini;
            this.endStr = end;
            return this.getChunk(true);
        } else {
            throw new ParserException(this.method, "<<palabra no encontrada>>");
        }
    }

    public String n_prevWord(int times) throws ParserException {
        this.method = "StringParserExt.prevWord( int" + times + " ): ";
        String result = "";
        if (times < 1) {
            throw new ParserException(this.method, "<< \"times\" debe ser mayor q cero!!! >>");
        } else {
            for (int aTimes = 1; aTimes <= times; ++aTimes) {
                result = this.n_prevWord();
            }

            return result;
        }
    }

    public String n_nextWord() throws ParserException {
        this.method = "StringParserExt.nextWord(): ";
        int ini = this.endStr;
        if (ini > 0 & this.html.charAt(ini) != ' ' && this.html.charAt(ini - 1) != ' ') {
            ini = this.html.indexOf(" ", ini);
        }

        if (ini >= 0 && ini <= this.html.length()) {
            int end;
            for (end = ini + 1; (end = this.html.indexOf(" ", end)) > -1 && this.html.charAt(end - 1) == ' '; ++end) {
            }

            if (end < 0) {
                if (this.html.charAt(this.html.length() - 1) == ' ') {
                    throw new ParserException(this.method, "<<palabra no encontrada>>");
                }

                end = this.html.length();
            }

            this.iniStr = ini;
            this.endStr = end;
            return this.getChunk(true);
        } else {
            throw new ParserException(this.method, "<<palabra no encontrada>>");
        }
    }

    public String n_nextWord(int times) throws ParserException {
        this.method = "StringParserExt.nextWord( int" + times + " ): ";
        String result = "";
        if (times < 1) {
            throw new ParserException(this.method, "<< \"times\" debe ser mayor q cero!!! >>");
        } else {
            for (int aTimes = 1; aTimes <= times; ++aTimes) {
                result = this.n_nextWord();
            }

            return result;
        }
    }

    public String n_closingTo(String searched, boolean forward, boolean trim) throws ParserException {
        this.method = "StringParserExt.closingTo(\"" + searched + "\", " + forward + ", " + trim + "): ";
        int aIndex;
        if (forward) {
            aIndex = this.html.indexOf(searched, this.iniStr);
        } else {
            aIndex = this.html.lastIndexOf(searched, this.endStr);
        }

        if (aIndex < 0) {
            throw new ParserException(this.method, "<<searched no encontrado>>");
        } else {
            if (forward) {
                this.endStr = aIndex;
            } else {
                this.iniStr = aIndex + searched.length();
            }

            return this.getChunk(trim);
        }
    }

    private int minValue(int X, int Y) {
        return X < Y ? X : Y;
    }

    private int maxValue(int X, int Y) {
        return X > Y ? X : Y;
    }

    private String getChunk(boolean trim) throws ParserException {
        String result = "";

        try {
            if (this.iniStr < 0) {
                throw new ParserException(this.method, "");
            }

            if (this.endStr < 0) {
                throw new ParserException(this.method, "");
            }

            int ini = this.minValue(this.iniStr, this.endStr);
            int end = this.maxValue(this.iniStr, this.endStr);
            this.iniStr = ini;
            this.endStr = end;
            result = this.html.substring(this.iniStr, this.endStr);
        } catch (Exception var5) {
            throw new ParserException(this.method, var5);
        }

        return trim ? result.trim() : result;
    }

    private boolean findChunk(String aChunk, int aTimes, boolean aForward, boolean to_iniStr, boolean beginSearch) throws ParserException {
        boolean result = false;
        int aIndex;
        int count = 0;
        int aPos;
        if (aTimes < 1) {
            throw new ParserException(this.method, " -> Times debe ser mayor q cero");
        } else if (aChunk.equals("")) {
            throw new ParserException(this.method, " -> El fragmento a buscar no debe ser vacio");
        } else {
            aPos = this.iniStr;

            try {
                aIndex = aForward ? this.html.indexOf(aChunk, this.endStr) : this.html.lastIndexOf(aChunk, this.iniStr);
                if (aTimes > 1) {
                    while (aIndex > 0) {
                        ++count;
                        if (count == aTimes) {
                            break;
                        }

                        aPos = aForward ? aIndex + aChunk.length() : aIndex - aChunk.length();
                        aIndex = aForward ? this.html.indexOf(aChunk, aPos) : this.html.lastIndexOf(aChunk, aPos);
                    }

                    if (count != aTimes) {
                        aIndex = -1;
                    }
                }

                if (aIndex < 0) {
                    result = false;
                } else {
                    result = true;
                    if (to_iniStr) {
                        this.iniStr = beginSearch ? aIndex : aIndex + aChunk.length();
                        this.endStr = this.iniStr;
                    } else {
                        this.endStr = aForward ? aIndex : aIndex + aChunk.length();
                    }
                }

                return result;
            } catch (Exception var11) {
                throw new ParserException(this.method, var11);
            }
        }
    }

    static {
        StringBuffer buff = new StringBuffer();

        for (char i = 0; i < ' '; ++i) {
            if (i != '\t' && i != '\n' && i != '\r') {
                buff.append(i);
            }
        }

        illegalXMLChars = buff.toString().getBytes();
        Arrays.sort(illegalXMLChars);
    }
}

