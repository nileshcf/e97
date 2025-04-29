package com.cloudframe.app.sf320010.dto;

/**
*  The class MciwinYearToWindow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MciwinYearToWindow extends MciwinYearToWindowSerialized {
   
				@Getter @Setter private MciwinFormats mciwinFormats = new MciwinFormats();
				@Getter @Setter private MciwinFormatsRedefined01 mciwinFormatsRedefined01 = new MciwinFormatsRedefined01();
				@Getter @Setter private MciwinFormatsRedefined02 mciwinFormatsRedefined02 = new MciwinFormatsRedefined02();
				@Getter @Setter private MciwinFormatsRedefined mciwinFormatsRedefined = new MciwinFormatsRedefined();
	
	/**
	* Constructor for MciwinYearToWindow
	**/
    public MciwinYearToWindow() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMciwinFormats().setParent(this,getStartOffset() + 0);
					getMciwinFormatsRedefined01().setParent(this,getStartOffset() + 0);
					getMciwinFormatsRedefined02().setParent(this,getStartOffset() + 0);
					getMciwinFormatsRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
