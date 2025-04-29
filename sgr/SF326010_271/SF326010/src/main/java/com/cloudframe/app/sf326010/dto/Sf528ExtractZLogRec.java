package com.cloudframe.app.sf326010.dto;

/**
*  The class Sf528ExtractZLogRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf528ExtractZLogRec extends Sf528ExtractZLogRecSerialized {
   

						@Getter @Setter private char[] sf528ServerId = Field.fillLowValue(3);

						@Getter @Setter private char[] sf528LogClass = Field.fillLowValue(1);

						@Getter @Setter private char[] sf528LogType = Field.fillLowValue(1);

						@Getter @Setter private char[] sf528ServiceId = Field.fillLowValue(4);

						@Getter @Setter private char[] sf528ServiceStatus = Field.fillLowValue(1);

								@Getter @Setter private int sf528ElapsedTime;

						@Getter @Setter private char[] sf528MipLogRefNum = Field.fillLowValue(6);
				@Getter @Setter private Sf528ServiceDateTime sf528ServiceDateTime = new Sf528ServiceDateTime();
	
	/**
	* Constructor for Sf528ExtractZLogRec
	**/
    public Sf528ExtractZLogRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSf528ServiceDateTime().setParent(this,getStartOffset() + 23);
	   	/*  end of offset */
    }





}
  
