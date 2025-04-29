package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip38201DcbInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip38201DcbInfo extends Ip38201DcbInfoSerialized { 
   

						@Getter @Setter private char[] ip38201Recfm = Field.fillLowValue(3);

								@Getter @Setter private long ip38201Lrecl;

								@Getter @Setter private long ip38201Blksize;

								@Getter @Setter private long ip38201Bufno;

								@Getter @Setter private long ip38201AverageLrecl;

								@Getter @Setter private long ip38201RecordCount;

								@Getter @Setter private long ip38201BlockLength;
	
	/**
	* Constructor for Ip38201DcbInfo
	**/
    public Ip38201DcbInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip38201DcbInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201DcbInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip38201DcbInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp38201Recfm(CONSTANTS.SPACE_3);
                     setIp38201Lrecl(0);
                     setIp38201Blksize(0);
                     setIp38201Bufno(0);
                     setIp38201AverageLrecl(0);
                     setIp38201RecordCount(0);
                     setIp38201BlockLength(0);
   }


}
  
