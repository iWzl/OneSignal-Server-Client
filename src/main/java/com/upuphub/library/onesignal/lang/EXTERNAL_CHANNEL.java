/*
 * MIT License
 *
 * Copyright (c) [2021] [Upuphub iWzl]
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * */

package com.upuphub.library.onesignal.lang;

/**
 * Indicates if the message type when targeting with
 * include_external_user_ids for cases where an email and
 * push subscriber has the same external user id.
 *
 * Example: Use the string "push" to indicate you are
 * sending a push notification or the string "email"
 * for sending emails.
 *
 * @author Upuphub iWzl
 * @date create time 2021-01-15 15:42
 **/
public enum EXTERNAL_CHANNEL {

    /**
     * PUSH
     */
    PUSH("push"),
    /**
     * EMAIL
     */
    EMAIL("email");

    private final String channel;

    public String VALUE(){
        return this.channel;
    }

    EXTERNAL_CHANNEL(String channel) {
        this.channel = channel;
    }
}
