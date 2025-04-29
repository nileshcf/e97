package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FileIdFinan is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip40004FileIdFinan extends Ip40004FileIdFinanSerialized { 
   

						@Getter @Setter private char[] ip40004FinFileType = Field.fillLowValue(3);

								@Getter @Setter private long ip40004FinFileRefDate;

						@Getter @Setter private char[] ip40004FinProcessorId = Field.fillLowValue(11);

								@Getter @Setter private long ip40004FinFileSeqNum;
	
	/**
	* Constructor for Ip40004FileIdFinan
	**/
    public Ip40004FileIdFinan() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004FileIdFinan. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FileIdFinan(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip40004FileIdFinan
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004FinFileType(CONSTANTS.SPACE_3);
                     setIp40004FinFileRefDate(0);
         setIp40004FinProcessorId(CONSTANTS.SPACE_11);
                     setIp40004FinFileSeqNum(0);
   }


}
  
