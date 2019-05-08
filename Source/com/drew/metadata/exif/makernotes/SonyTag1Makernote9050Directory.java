package com.drew.metadata.exif.makernotes;

import com.drew.lang.annotations.NotNull;
import com.drew.metadata.Directory;

import java.util.HashMap;

public class SonyTag1Makernote9050Directory extends Directory
{
    public static final int TAG_SONY_MAX_APERATURE = 0x0000;
    public static final int TAG_SONY_MIN_APERATURE = 0x0001;
    public static final int TAG_SHUTTER = 0x0020;
    public static final int TAG_FLASH_STATUS = 0x0031; //a
    public static final int TAG_FLASH_STATUS_2 = 0x0039; //b
    public static final int TAG_SHUTTER_COUNT = 0x0032; //a
    public static final int TAG_SHUTTER_COUNT_2 = 0x003a; //b


    @NotNull
    protected static final HashMap<Integer, String> _tagNameMap = new HashMap<Integer, String>();


    static {
        _tagNameMap.put(TAG_SONY_MAX_APERATURE, "Max Aperature");
        _tagNameMap.put(TAG_SONY_MIN_APERATURE, "Min Aperature");
        _tagNameMap.put(TAG_SHUTTER, "Shutter");
        _tagNameMap.put(TAG_FLASH_STATUS, "Flash");
        _tagNameMap.put(TAG_FLASH_STATUS_2, "Flash 2");
        _tagNameMap.put(TAG_SHUTTER_COUNT, "Shutter Count");
        _tagNameMap.put(TAG_SHUTTER_COUNT_2, "Shutter Count 2");
    }


    public SonyTag1Makernote9050Directory()
    {
        this.setDescriptor(new SonyTag1Makernote9050Descriptor(this));
    }

    @Override
    public String getName() {
        return "Sony Makernote 9050";
    }

    @Override
    protected HashMap<Integer, String> getTagNameMap() {
        return _tagNameMap;
    }
}
