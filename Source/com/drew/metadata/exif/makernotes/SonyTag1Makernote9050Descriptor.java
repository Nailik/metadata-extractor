package com.drew.metadata.exif.makernotes;

import com.drew.lang.annotations.Nullable;
import com.drew.metadata.TagDescriptor;

public class SonyTag1Makernote9050Descriptor extends TagDescriptor {

    public SonyTag1Makernote9050Descriptor(SonyTag1Makernote9050Directory directory) {
        super(directory);
    }

    @Override
    @Nullable
    public String getDescription(int tagType) {
       return _directory.getInteger(tagType).toString();
    }

}
