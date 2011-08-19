/*
 * Copyright (c) 2011 Soichiro Kashima
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.blogspot.ksoichiro.android.contactsaggregator.sample.list;

/**
 * Utilities for manipulating String.
 * 
 * @author Soichiro Kashima
 * @since 2011/08/19
 */
public final class StringUtils {

    /**
     * Constructor. Hidden from other classes.
     */
    private StringUtils() {
    }

    /**
     * Joins elements with delimiter.
     * 
     * @param <T> type of the iterable object
     * @param iterable iterable objects to be joined
     * @param delimiter delimiter to insert between two elements
     * @return joined elements as a string
     */
    public static <T> String join(final Iterable<T> iterable, final String delimiter) {
        String result = "";
        String realDelimiter = delimiter == null ? "," : delimiter;
        for (T element : iterable) {
            result += realDelimiter + element.toString();
        }
        return result.length() == 0 ? "" : result.substring(1);
    }
}