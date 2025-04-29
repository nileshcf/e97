package com.cloudframe.app.ip662010.dto;

/**
*  The class IpmErrorMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class IpmErrorMsg600 extends IpmErrorMsg600Serialized {
   


								@Getter @Setter private long errorCode600;


								@Getter @Setter private char[] ipmErrorRecordNo600 = Field.fillLowValue(11);

				@Getter @Setter private IpmErrorElementId600 ipmErrorElementId600 = new IpmErrorElementId600();


						@Getter @Setter private char[] ipmErrorText600 = Field.fillLowValue(64);
	
	/**
	* Constructor for IpmErrorMsg600
	**/
    public IpmErrorMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIpmErrorElementId600().setParent(this,getStartOffset() + 32);
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("IP662010-").toCharArray()
             , getStartOffset() + 0
             ,9
             );
       replaceValue( // serialize and save the value
             ("-REC ").toCharArray()
             , getStartOffset() + 14
             ,5
             );
       replaceValue( // serialize and save the value
             (": ").toCharArray()
             , getStartOffset() + 30
             ,2
             );
       replaceValue( // serialize and save the value
             (": ").toCharArray()
             , getStartOffset() + 37
             ,2
             );
    }





}
  
