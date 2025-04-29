package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01ConvertibleSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Bdms01ConvertibleSegData extends Bdms01ConvertibleSegDataSerialized { 
   

								@Getter @Setter private int bdms01ConvertibleSegSqlcd;

								@Getter @Setter private BigDecimal msdCnvrtbleConvtnRate = BigDecimal.ZERO;

						@Getter @Setter private char[] msdCnvrtbleConvtnCode = Field.fillLowValue(2);

								@Getter @Setter private long msdCnvrtbleConvtnExpDt;

						@Getter @Setter private char[] bdms01CvrsnExptnDt = Field.fillLowValue(10);

	
	/**
	* Constructor for Bdms01ConvertibleSegData
	**/
    public Bdms01ConvertibleSegData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Bdms01ConvertibleSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01ConvertibleSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Bdms01ConvertibleSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01ConvertibleSegSqlcd(0);
			setMsdCnvrtbleConvtnRate(BigDecimal.ZERO);
         setMsdCnvrtbleConvtnCode(CONSTANTS.SPACE_2);
                     setMsdCnvrtbleConvtnExpDt(0);
         setBdms01CvrsnExptnDt(CONSTANTS.SPACE_10);
   }


}
  
