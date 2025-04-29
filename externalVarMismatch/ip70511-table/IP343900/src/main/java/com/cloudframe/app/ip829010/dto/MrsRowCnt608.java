package com.cloudframe.app.ip829010.dto;

/**
*  The class MrsRowCnt608 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MrsRowCnt608 extends MrsRowCnt608Serialized {
   



								@Getter @Setter private long mrsIsrtCnt608;
	
	/**
	* Constructor for MrsRowCnt608
	**/
    public MrsRowCnt608() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP829010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("NO. OF RECS INSERTED INTO TIPAMRS   =      ").toCharArray()
             , getStartOffset() + 9
             ,43
             );
    }





}
  
