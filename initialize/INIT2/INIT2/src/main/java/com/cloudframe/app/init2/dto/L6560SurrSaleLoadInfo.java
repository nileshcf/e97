package com.cloudframe.app.init2.dto;

/**
*  The class L6560SurrSaleLoadInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/


import com.cloudframe.app.init2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import com.cloudframe.app.data.Field;


public class L6560SurrSaleLoadInfo extends L6560SurrSaleLoadInfoSerialized { 
   

								private BigDecimal l6560SurrSaleLoadAmt = BigDecimal.ZERO;
	
	/**
	* Constructor for L6560SurrSaleLoadInfo
	**/
    public L6560SurrSaleLoadInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for L6560SurrSaleLoadInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560SurrSaleLoadInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public BigDecimal getL6560SurrSaleLoadAmt() throws CFException {
        if (isL6560SurrSaleLoadAmtModified()) { 
           l6560SurrSaleLoadAmt = refreshL6560SurrSaleLoadAmt();
        }
   		return l6560SurrSaleLoadAmt;
	}

    public char[] getL6560SurrSaleLoadAmtString() {
          return  l6560SurrSaleLoadAmtString();
    }
	
	/**
	 * 	Update L6560SurrSaleLoadAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-SURR-SALE-LOAD-AMT
	 *	@param number
	 */
	public void setL6560SurrSaleLoadAmt(BigDecimal number) {	
     l6560SurrSaleLoadAmt = checkL6560SurrSaleLoadAmtMaxLimit(number);
	    serializeL6560SurrSaleLoadAmt(l6560SurrSaleLoadAmt);
   }

	
	
	
	/**
	 * 	initializes L6560SurrSaleLoadInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
			setL6560SurrSaleLoadAmt(BigDecimal.ZERO);
   }

		public static int getL6560SurrSaleLoadInfoFieldLength() {
			return L_6560_SURR_SALE_LOAD_INFO_LENGTH;
		}

}
  
