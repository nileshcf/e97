package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FileId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip40004FileId extends Ip40004FileIdSerialized { 
   

						@Getter @Setter private char[] ip40004FileType = Field.fillLowValue(3);

								@Getter @Setter private long ip40004FileRefDate;

						@Getter @Setter private char[] ip40004ProcessorId = Field.fillLowValue(11);

								@Getter @Setter private long ip40004FileSeqNum;
	
	/**
	* Constructor for Ip40004FileId
	**/
    public Ip40004FileId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004FileId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip40004FileId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004FileType(CONSTANTS.SPACE_3);
                     setIp40004FileRefDate(0);
         setIp40004ProcessorId(CONSTANTS.SPACE_11);
                     setIp40004FileSeqNum(0);
   }


}
  
