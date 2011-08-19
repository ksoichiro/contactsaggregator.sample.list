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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Adapter for the contact information.
 * 
 * @author Soichiro Kashima
 * @since 2011/08/19
 */
public final class ContactsAdapter extends ArrayAdapter<ContactInfo> {

    /** Layout inflator. */
    private LayoutInflater mInflater;

    /**
     * Creates a new ContactsAdapter.
     * 
     * @param context context
     * @param contacts contacts to list
     */
    public ContactsAdapter(final Context context, final List<ContactInfo> contacts) {
        super(context, R.layout.contact_row, contacts.toArray(new ContactInfo[] {}));
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            // Sets the layout if it has not benn read yet
            view = mInflater.inflate(R.layout.contact_row, null);
        }

        if (getCount() > position) {
            ContactInfo contactInfo = getItem(position);
            ((TextView) view.findViewById(R.id.display_name)).setText(contactInfo.getDisplayName());
            ((TextView) view.findViewById(R.id.emails)).setText(contactInfo.getEmails());
        }

        return view;
    }
}
