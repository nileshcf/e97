package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinYearToWindow800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MciwinYearToWindow800 extends MciwinYearToWindow800Serialized {
   
				@Getter @Setter private MciwinFormats800 mciwinFormats800 = new MciwinFormats800();
				@Getter @Setter private MciwinFormats800Redefined01 mciwinFormats800Redefined01 = new MciwinFormats800Redefined01();
				@Getter @Setter private MciwinFormats800Redefined02 mciwinFormats800Redefined02 = new MciwinFormats800Redefined02();
				@Getter @Setter private MciwinFormats800Redefined mciwinFormats800Redefined = new MciwinFormats800Redefined();
	
	/**
	* Constructor for MciwinYearToWindow800
	**/
    public MciwinYearToWindow800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMciwinFormats800().setParent(this,getStartOffset() + 0);
					getMciwinFormats800Redefined01().setParent(this,getStartOffset() + 0);
					getMciwinFormats800Redefined02().setParent(this,getStartOffset() + 0);
					getMciwinFormats800Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
