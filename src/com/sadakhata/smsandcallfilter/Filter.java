/*
 * Author: Hasib Al Muhaimin.
 * 
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 * 
 * ***courtesy to Jelle Geerts***
 * Author: Jelle Geerts

 * Usage of the works is permitted provided that this instrument is
 * retained with the works, so that any entity that uses the works is
 * notified of this instrument.
 *
 * DISCLAIMER: THE WORKS ARE WITHOUT WARRANTY.
*/

package com.sadakhata.smsandcallfilter;

import java.util.List;

public class Filter
{
    String name;
    String address;
    List<String> contentFilters;

    public Filter(String name, String address, List<String> contentFilters)
    {
        this.name = name;
        this.address = address;
        this.contentFilters = contentFilters;
    }
}
