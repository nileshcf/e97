package com.cloudframe.app.move0.dto;

/**
*  The class AidUserByteGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AidUserByteGroup extends AidUserByteGroupSerialized {
   

						@Getter @Setter private char[] aidUserByte = new char[2];
					@Getter @Setter private AidUserByteRedefined01 aidUserByteRedefined01 = new AidUserByteRedefined01();
					@Getter @Setter private AidUserByteRedefined aidUserByteRedefined = new AidUserByteRedefined();
	
	/**
	* Constructor for AidUserByteGroup
	**/
    public AidUserByteGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getAidUserByteRedefined01().setParent(this,getStartOffset() + 0);
					getAidUserByteRedefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setAidUserByte(fillSpace(2));
    }





}
  
