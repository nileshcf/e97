package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004FinStatRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;
import com.cloudframe.app.common.CONSTANTS;
import java.util.ArrayList;


@Data
public class Ip40004FinStatRec extends Ip40004FinStatRecSerialized { 
   

						@Getter @Setter private char[] ip40004TransmissionId = Field.fillLowValue(25);
				@Getter @Setter private Ip40004FileIdFinan ip40004FileIdFinan = new Ip40004FileIdFinan();

						@Getter @Setter private char[] ip40004FinancialInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip40004MtiFunc = Field.fillLowValue(8);

						@Getter @Setter private char[] ip40004ReversalInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip40004ReversalDate = Field.fillLowValue(6);

						@Getter @Setter private char[] ip40004TransType2 = Field.fillLowValue(2);

								@Getter @Setter private int ip40004Mcc;

						@Getter @Setter private char[] ip40004Ird = Field.fillLowValue(2);

						@Getter @Setter private char[] ip40004CurrencyCode = Field.fillLowValue(3);

						@Getter @Setter private char[] ip40004CurrencyExp = Field.fillLowValue(1);
      private List<char[]> ip40004InvDtlData; 

	
	/**
	* Constructor for Ip40004FinStatRec
	**/
    public Ip40004FinStatRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004FinStatRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004FinStatRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp40004FileIdFinan().setParent(this,getStartOffset() + 25);
    } 

	/**
	 * 	initializes Ip40004FinStatRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004TransmissionId(CONSTANTS.SPACE_25);
          getIp40004FileIdFinan().initialize();
     
         setIp40004FinancialInd(CONSTANTS.SPACE);
         setIp40004MtiFunc(CONSTANTS.SPACE_8);
         setIp40004ReversalInd(CONSTANTS.SPACE);
         setIp40004ReversalDate(CONSTANTS.SPACE_6);
         setIp40004TransType2(CONSTANTS.SPACE_2);
                     setIp40004Mcc(0);
         setIp40004Ird(CONSTANTS.SPACE_2);
         setIp40004CurrencyCode(CONSTANTS.SPACE_3);
         setIp40004CurrencyExp(CONSTANTS.SPACE);
         for (int index =0; index < IP_40004_INV_DTL_DATA_SIZE;index++) {
             setIp40004InvDtlData(index, CONSTANTS.SPACE_50);
         }
   }


}
  
