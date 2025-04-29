package com.cloudframe.app.ms00d363.dto;

/**
*  The class ProductTblGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ProductTblGroup extends ProductTblGroupSerialized {
   

						@Getter @Setter private char[] productTbl = new char[588];
					@Getter @Setter private ProductTable productTable = new ProductTable();
	
	/**
	* Constructor for ProductTblGroup
	**/
    public ProductTblGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getProductTable().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setProductTbl("010CIRRUS                   020MASTERCARD               030MASTERCARD CHIP          040MAESTRO POS              050MAESTRO ATM              060MAESTRO                  070DEBIT MASTERCARD AUTH    080DEBIT MASTERCARD CLEARING090DEBIT MASTERCARD PAYMENT 100PLUS                     105ACCEL/EXCHANGE           110VISA                     120AMERICAN EXPRESS         130MASTER BANKING           140VISA CASH                150DISCOVER                 160DINERS CLUB              170JCB                      180PRIVATE LABEL            925NO ACTIVITY              999FUTURE USE               ".toCharArray());
    }





}
  
