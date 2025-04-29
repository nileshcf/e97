package com.cloudframe.app.ms00d363.dto;

/**
*  The class QualityTitle is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class QualityTitle extends QualityTitleSerialized {
   


	
	/**
	* Constructor for QualityTitle
	**/
    public QualityTitle() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(8)
             , getStartOffset() + 0
             ,8
             );
       replaceValue( // serialize and save the value
             ("**DTF TEST**       ").toCharArray()
             , getStartOffset() + 8
             ,19
             );
    }


 


	
	
	

		public static int getQualityTitleFieldLength() {
			return QUALITY_TITLE_LENGTH;
		}

}
  
