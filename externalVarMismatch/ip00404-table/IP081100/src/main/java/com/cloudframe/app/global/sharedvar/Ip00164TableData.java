package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00164TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip00164TableData extends Ip00164TableDataSerialized { 
   

						@Getter @Setter private char[] ip00164LicensedProdId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip00164ProdId = Field.fillLowValue(3);

						@Getter @Setter private char[] ip00164Ab = Field.fillLowValue(3);

						@Getter @Setter private char[] ip00164ProdClass = Field.fillLowValue(3);

						@Getter @Setter private char[] ip00164ProdType = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00164ProdCatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00164EuroProdCatCd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00164CmrclProductInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip00164Filler = Field.fillLowValue(6);
	
	/**
	* Constructor for Ip00164TableData
	**/
    public Ip00164TableData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00164TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00164TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00164TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00164LicensedProdId(CONSTANTS.SPACE_3);
         setIp00164ProdId(CONSTANTS.SPACE_3);
         setIp00164Ab(CONSTANTS.SPACE_3);
         setIp00164ProdClass(CONSTANTS.SPACE_3);
         setIp00164ProdType(CONSTANTS.SPACE);
         setIp00164ProdCatCd(CONSTANTS.SPACE);
         setIp00164EuroProdCatCd(CONSTANTS.SPACE);
         setIp00164CmrclProductInd(CONSTANTS.SPACE);
         setIp00164Filler(CONSTANTS.SPACE_6);
   }


}
  
