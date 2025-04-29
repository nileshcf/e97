package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip98901PaymentFileData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip98901PaymentFileData extends Ip98901PaymentFileDataSerialized {
   
				@Getter @Setter private Ip98901ClearingDate ip98901ClearingDate = new Ip98901ClearingDate();

						@Getter @Setter private char[] ip98901TransactionAmount = Field.fillLowValue(12);
				@Getter @Setter private Ip98901TransactionDate ip98901TransactionDate = new Ip98901TransactionDate();

						@Getter @Setter private char[] ip98901Merchant = Field.fillLowValue(25);

						@Getter @Setter private char[] ip98901BankNetReference = Field.fillLowValue(9);

						@Getter @Setter private char[] ip98901BankNetDate = Field.fillLowValue(4);

								@Getter @Setter private long ip98901IssuerIca;

								@Getter @Setter private long ip98901AcquirerIca;

						@Getter @Setter private char[] ip98901PanAlias = Field.fillLowValue(36);

						@Getter @Setter private char[] ip98901ProductCode = Field.fillLowValue(3);

	
	/**
	* Constructor for Ip98901PaymentFileData
	**/
    public Ip98901PaymentFileData() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getIp98901ClearingDate().setParent(this,getStartOffset() + 0);
					getIp98901TransactionDate().setParent(this,getStartOffset() + 18);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Ip98901PaymentFileData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp98901ClearingDate().initialize();
     
         setIp98901TransactionAmount(CONSTANTS.SPACE_12);
          getIp98901TransactionDate().initialize();
     
         setIp98901Merchant(CONSTANTS.SPACE_25);
         setIp98901BankNetReference(CONSTANTS.SPACE_9);
         setIp98901BankNetDate(CONSTANTS.SPACE_4);
                     setIp98901IssuerIca(0);
                     setIp98901AcquirerIca(0);
         setIp98901PanAlias(CONSTANTS.SPACE_36);
         setIp98901ProductCode(CONSTANTS.SPACE_3);
   }


}
  
