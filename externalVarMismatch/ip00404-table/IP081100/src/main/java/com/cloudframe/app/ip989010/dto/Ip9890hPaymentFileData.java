package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip9890hPaymentFileData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip9890hPaymentFileData extends Ip9890hPaymentFileDataSerialized {
   
				@Getter @Setter private Ip9890hClearingDate ip9890hClearingDate = new Ip9890hClearingDate();

						@Getter @Setter private char[] ip9890hTransactionAmount = Field.fillLowValue(12);
				@Getter @Setter private Ip9890hTransactionDate ip9890hTransactionDate = new Ip9890hTransactionDate();

						@Getter @Setter private char[] ip9890hMerchant = Field.fillLowValue(25);

						@Getter @Setter private char[] ip9890hBankNetReference = Field.fillLowValue(9);

						@Getter @Setter private char[] ip9890hBankNetDate = Field.fillLowValue(4);

								@Getter @Setter private long ip9890hIssuerIca;

								@Getter @Setter private long ip9890hAcquirerIca;

						@Getter @Setter private char[] ip9890hPanAlias = Field.fillLowValue(36);

						@Getter @Setter private char[] ip9890hProductCode = Field.fillLowValue(3);

	
	/**
	* Constructor for Ip9890hPaymentFileData
	**/
    public Ip9890hPaymentFileData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp9890hClearingDate().setParent(this,getStartOffset() + 0);
					getIp9890hTransactionDate().setParent(this,getStartOffset() + 18);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ip9890hPaymentFileData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp9890hClearingDate().initialize();
     
         setIp9890hTransactionAmount(CONSTANTS.SPACE_12);
          getIp9890hTransactionDate().initialize();
     
         setIp9890hMerchant(CONSTANTS.SPACE_25);
         setIp9890hBankNetReference(CONSTANTS.SPACE_9);
         setIp9890hBankNetDate(CONSTANTS.SPACE_4);
                     setIp9890hIssuerIca(0);
                     setIp9890hAcquirerIca(0);
         setIp9890hPanAlias(CONSTANTS.SPACE_36);
         setIp9890hProductCode(CONSTANTS.SPACE_3);
   }


}
  
