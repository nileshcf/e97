package com.cloudframe.app.init2.dto;

/**
*  The class L6560OutputParmInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.init2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class L6560OutputParmInfo extends L6560OutputParmInfoSerialized { 
   

								private short l6560RetrnCd;

								private BigDecimal l6560SurrChrgAmt = BigDecimal.ZERO;

								private BigDecimal l6560SurrChrgFlatAmt = BigDecimal.ZERO;

								private BigDecimal l6560SurrChrgPct = BigDecimal.ZERO;

								private BigDecimal l6560MktvalAdjAmt = BigDecimal.ZERO;
			private List<L6560SurrSaleLoadInfo> l6560SurrSaleLoadInfo = new ArrayList<>();
    	

								private BigDecimal l6560FreeWthdrwAmt = BigDecimal.ZERO;

	
	/**
	* Constructor for L6560OutputParmInfo
	**/
    public L6560OutputParmInfo() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for L6560OutputParmInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560OutputParmInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of l6560RetrnCd
	 *	@return l6560RetrnCd
	 */
	public short getL6560RetrnCd() throws CFException {
        if (isL6560RetrnCdModified()) { 
           l6560RetrnCd = refreshL6560RetrnCd();
        }
   		return l6560RetrnCd;
	}
	
	/**
	 * 	Update L6560RetrnCd with the passed value
	 *  Corresponding COBOL Variable is L6560-RETRN-CD
	 *	@param number
	 */
	public void setL6560RetrnCd(short number) {
	     // Truncate if the number is beyond +/- Max range
	    l6560RetrnCd = checkL6560RetrnCdMaxLimit(number); 
		serializeL6560RetrnCd(l6560RetrnCd);
	}

	public void setL6560RetrnCd(int number) {
	    number = checkL6560RetrnCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setL6560RetrnCd((short)number);
	}
	public void setL6560RetrnCd(long number) {
	    number = checkL6560RetrnCdMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setL6560RetrnCd((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isL6560RetrnOk()
	 *	@return  Returns true if isL6560RetrnOk() is 0
	 */
   public boolean isL6560RetrnOk() throws CFException {
      return (  getL6560RetrnCd()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setL6560RetrnOkTrue() {  			
    	setL6560RetrnCd( (short)0);
   	}
	
	/**
	 *	Test condition 8 for isL6560RetrnPlanNotFound()
	 *	@return  Returns true if isL6560RetrnPlanNotFound() is 8
	 */
   public boolean isL6560RetrnPlanNotFound() throws CFException {
      return (  getL6560RetrnCd()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setL6560RetrnPlanNotFoundTrue() {  			
    	setL6560RetrnCd( (short)8);
   	}
	
	/**
	 *	Test condition 9 for isL6560RetrnRhrtNotFound()
	 *	@return  Returns true if isL6560RetrnRhrtNotFound() is 9
	 */
   public boolean isL6560RetrnRhrtNotFound() throws CFException {
      return (  getL6560RetrnCd()  ==  9  );
   }


	/**
	*  set values 9
	*/
   	public void setL6560RetrnRhrtNotFoundTrue() {  			
    	setL6560RetrnCd( (short)9);
   	}
	
	/**
	 *	Test condition 10 for isL6560RetrnPcntNotFound()
	 *	@return  Returns true if isL6560RetrnPcntNotFound() is 10
	 */
   public boolean isL6560RetrnPcntNotFound() throws CFException {
      return (  getL6560RetrnCd()  ==  10  );
   }


	/**
	*  set values 10
	*/
   	public void setL6560RetrnPcntNotFoundTrue() {  			
    	setL6560RetrnCd( (short)10);
   	}
	
	/**
	 *	Test condition 80 for isL6560RetrnPctCalcError()
	 *	@return  Returns true if isL6560RetrnPctCalcError() is 80
	 */
   public boolean isL6560RetrnPctCalcError() throws CFException {
      return (  getL6560RetrnCd()  ==  80  );
   }


	/**
	*  set values 80
	*/
   	public void setL6560RetrnPctCalcErrorTrue() {  			
    	setL6560RetrnCd( (short)80);
   	}
	
	/**
	 *	Test condition 90 for isL6560RetrnInvalidCvg()
	 *	@return  Returns true if isL6560RetrnInvalidCvg() is 90
	 */
   public boolean isL6560RetrnInvalidCvg() throws CFException {
      return (  getL6560RetrnCd()  ==  90  );
   }


	/**
	*  set values 90
	*/
   	public void setL6560RetrnInvalidCvgTrue() {  			
    	setL6560RetrnCd( (short)90);
   	}
	
	/**
	 *	Test condition 99 for isL6560RetrnInvalidRequest()
	 *	@return  Returns true if isL6560RetrnInvalidRequest() is 99
	 */
   public boolean isL6560RetrnInvalidRequest() throws CFException {
      return (  getL6560RetrnCd()  ==  99  );
   }


	/**
	*  set values 99
	*/
   	public void setL6560RetrnInvalidRequestTrue() {  			
    	setL6560RetrnCd( (short)99);
   	}
	public BigDecimal getL6560SurrChrgAmt() throws CFException {
        if (isL6560SurrChrgAmtModified()) { 
           l6560SurrChrgAmt = refreshL6560SurrChrgAmt();
        }
   		return l6560SurrChrgAmt;
	}

    public char[] getL6560SurrChrgAmtString() {
          return  l6560SurrChrgAmtString();
    }
	
	/**
	 * 	Update L6560SurrChrgAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-SURR-CHRG-AMT
	 *	@param number
	 */
	public void setL6560SurrChrgAmt(BigDecimal number) {	
     l6560SurrChrgAmt = checkL6560SurrChrgAmtMaxLimit(number);
	    serializeL6560SurrChrgAmt(l6560SurrChrgAmt);
   }
	public BigDecimal getL6560SurrChrgFlatAmt() throws CFException {
        if (isL6560SurrChrgFlatAmtModified()) { 
           l6560SurrChrgFlatAmt = refreshL6560SurrChrgFlatAmt();
        }
   		return l6560SurrChrgFlatAmt;
	}

    public char[] getL6560SurrChrgFlatAmtString() {
          return  l6560SurrChrgFlatAmtString();
    }
	
	/**
	 * 	Update L6560SurrChrgFlatAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-SURR-CHRG-FLAT-AMT
	 *	@param number
	 */
	public void setL6560SurrChrgFlatAmt(BigDecimal number) {	
     l6560SurrChrgFlatAmt = checkL6560SurrChrgFlatAmtMaxLimit(number);
	    serializeL6560SurrChrgFlatAmt(l6560SurrChrgFlatAmt);
   }
	public BigDecimal getL6560SurrChrgPct() throws CFException {
        if (isL6560SurrChrgPctModified()) { 
           l6560SurrChrgPct = refreshL6560SurrChrgPct();
        }
   		return l6560SurrChrgPct;
	}

    public char[] getL6560SurrChrgPctString() {
          return  l6560SurrChrgPctString();
    }
	
	/**
	 * 	Update L6560SurrChrgPct with the passed number
	 *  Corresponding COBOL Variable is L6560-SURR-CHRG-PCT
	 *	@param number
	 */
	public void setL6560SurrChrgPct(BigDecimal number) {	
     l6560SurrChrgPct = checkL6560SurrChrgPctMaxLimit(number);
	    serializeL6560SurrChrgPct(l6560SurrChrgPct);
   }
	public BigDecimal getL6560MktvalAdjAmt() throws CFException {
        if (isL6560MktvalAdjAmtModified()) { 
           l6560MktvalAdjAmt = refreshL6560MktvalAdjAmt();
        }
   		return l6560MktvalAdjAmt;
	}

    public char[] getL6560MktvalAdjAmtString() {
          return  l6560MktvalAdjAmtString();
    }
	
	/**
	 * 	Update L6560MktvalAdjAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-MKTVAL-ADJ-AMT
	 *	@param number
	 */
	public void setL6560MktvalAdjAmt(BigDecimal number) {	
     l6560MktvalAdjAmt = checkL6560MktvalAdjAmtMaxLimit(number);
	    serializeL6560MktvalAdjAmt(l6560MktvalAdjAmt);
   }
	/**
	 *	Returns the  value of l6560SurrSaleLoadInfo
	 *  Corresponding COBOL Variable is L6560-SURR-SALE-LOAD-INFO
	 *	@return l6560SurrSaleLoadInfo
	 */
   public List<L6560SurrSaleLoadInfo> getL6560SurrSaleLoadInfo() {
       return l6560SurrSaleLoadInfo;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return l6560SurrSaleLoadInfo
	 */
	public L6560SurrSaleLoadInfo getL6560SurrSaleLoadInfo(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getL6560SurrSaleLoadInfo(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= L_6560_SURR_SALE_LOAD_INFO_SIZE) {
             	index = L_6560_SURR_SALE_LOAD_INFO_SIZE -1; // can't exceed max array size
             	logger.trace("l6560SurrSaleLoadInfo - Array index exceeded max Size {}, resetting it to max allowed",L_6560_SURR_SALE_LOAD_INFO_SIZE); 
	    }
		if (index >= l6560SurrSaleLoadInfo.size()) {
       		for (int fillIndex =  l6560SurrSaleLoadInfo.size() -1; fillIndex < index;fillIndex++) {
		       l6560SurrSaleLoadInfo.add(null);
		    }
			l6560SurrSaleLoadInfo.set(index,
			   	   	new L6560SurrSaleLoadInfo(this,beginL6560SurrSaleLoadInfo + index * L6560SurrSaleLoadInfo.getL6560SurrSaleLoadInfoFieldLength()) 
				                        ); 	
		} 
   	   L6560SurrSaleLoadInfo value = l6560SurrSaleLoadInfo.get(index);
   	   if (value == null) {
   	      l6560SurrSaleLoadInfo.set(index,
			   	   	new L6560SurrSaleLoadInfo(this,beginL6560SurrSaleLoadInfo + index * L6560SurrSaleLoadInfo.getL6560SurrSaleLoadInfoFieldLength()) 
				                        ); 
		  value = l6560SurrSaleLoadInfo.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update L6560SurrSaleLoadInfo at index with the passed value
	 *  Corresponding COBOL Variable is L6560-SURR-SALE-LOAD-INFO
	 *  @param index
	 *	@param value
	 */
  public void setL6560SurrSaleLoadInfo(int index,char[] value) {
   	getL6560SurrSaleLoadInfo(index).setString(value);
   }
   
	
	public BigDecimal getL6560FreeWthdrwAmt() throws CFException {
        if (isL6560FreeWthdrwAmtModified()) { 
           l6560FreeWthdrwAmt = refreshL6560FreeWthdrwAmt();
        }
   		return l6560FreeWthdrwAmt;
	}

    public char[] getL6560FreeWthdrwAmtString() {
          return  l6560FreeWthdrwAmtString();
    }
	
	/**
	 * 	Update L6560FreeWthdrwAmt with the passed number
	 *  Corresponding COBOL Variable is L6560-FREE-WTHDRW-AMT
	 *	@param number
	 */
	public void setL6560FreeWthdrwAmt(BigDecimal number) {	
     l6560FreeWthdrwAmt = checkL6560FreeWthdrwAmtMaxLimit(number);
	    serializeL6560FreeWthdrwAmt(l6560FreeWthdrwAmt);
   }

	
	
	
	/**
	 * 	initializes L6560OutputParmInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setL6560RetrnCd((short)0);
			setL6560SurrChrgAmt(BigDecimal.ZERO);
			setL6560SurrChrgFlatAmt(BigDecimal.ZERO);
			setL6560SurrChrgPct(BigDecimal.ZERO);
			setL6560MktvalAdjAmt(BigDecimal.ZERO);
     if (l6560SurrSaleLoadInfo.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  L_6560_SURR_SALE_LOAD_INFO_SIZE;index++) {
              L6560SurrSaleLoadInfo  newElement = new L6560SurrSaleLoadInfo(this,beginL6560SurrSaleLoadInfo + index * L6560SurrSaleLoadInfo.getL6560SurrSaleLoadInfoFieldLength());
              newElement.initialize();
               l6560SurrSaleLoadInfo.add(newElement);
          }
     } else {
        if (l6560SurrSaleLoadInfo.size() < L_6560_SURR_SALE_LOAD_INFO_SIZE) {
          // prefill it first
          for (int index = l6560SurrSaleLoadInfo.size();index <  L_6560_SURR_SALE_LOAD_INFO_SIZE;index++) {
              L6560SurrSaleLoadInfo  newElement = new L6560SurrSaleLoadInfo(this,beginL6560SurrSaleLoadInfo + index * L6560SurrSaleLoadInfo.getL6560SurrSaleLoadInfoFieldLength());
               l6560SurrSaleLoadInfo.add(newElement);
          }
        }
        
     	for (int index = 0;index <  L_6560_SURR_SALE_LOAD_INFO_SIZE;index++) {
     		L6560SurrSaleLoadInfo l6560SurrSaleLoadInfoVar = l6560SurrSaleLoadInfo.get(index);
 			if (l6560SurrSaleLoadInfoVar == null) {
                l6560SurrSaleLoadInfoVar = new L6560SurrSaleLoadInfo(this,beginL6560SurrSaleLoadInfo + index * L6560SurrSaleLoadInfo.getL6560SurrSaleLoadInfoFieldLength());
                  l6560SurrSaleLoadInfo.set(index, l6560SurrSaleLoadInfoVar);
			} 
			l6560SurrSaleLoadInfoVar.initialize();
		}
     }
			setL6560FreeWthdrwAmt(BigDecimal.ZERO);
   }

		public static int getL6560OutputParmInfoFieldLength() {
			return L_6560_OUTPUT_PARM_INFO_LENGTH;
		}

}
  
