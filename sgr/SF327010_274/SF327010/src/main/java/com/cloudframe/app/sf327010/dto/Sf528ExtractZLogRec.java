package com.cloudframe.app.sf327010.dto;

/**
*  The class Sf528ExtractZLogRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:33. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf528ExtractZLogRec extends Sf528ExtractZLogRecSerialized {
   

						@Getter @Setter private char[] sf528ServerId = Field.fillLowValue(3);

						@Getter @Setter private char[] sf528LogType = Field.fillLowValue(1);

						@Getter @Setter private char[] sf528ServiceId = Field.fillLowValue(4);

						@Getter @Setter private char[] sf528ServiceStatus = Field.fillLowValue(1);

								@Getter @Setter private int sf528ElapsedTime;

						@Getter @Setter private char[] sf528ServiceDateTime = Field.fillLowValue(14);
	
	/**
	* Constructor for Sf528ExtractZLogRec
	**/
    public Sf528ExtractZLogRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
