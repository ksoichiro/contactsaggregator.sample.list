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
 * Managing contact information.
 * 
 * @author Soichiro Kashima
 * @since 2011/08/19
 */
public final class ContactInfo {

    /** Display name. */
    private String mDisplayName;

    /** Emails. */
    private String mEmails;

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return mDisplayName;
    }

    /**
     * Set the display name to this object.
     * 
     * @param displayName display name to set
     */
    public void setDisplayName(final String displayName) {
        mDisplayName = displayName;
    }

    /**
     * Returns the emails.
     * 
     * @return emails
     */
    public String getEmails() {
        return mEmails;
    }

    /**
     * Set the emails to this object.
     * 
     * @param emails emails to set
     */
    public void setEmails(final String emails) {
        mEmails = emails;
    }
}
