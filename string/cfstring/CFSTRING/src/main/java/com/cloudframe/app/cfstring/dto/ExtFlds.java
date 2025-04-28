package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtFlds is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfstring.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ExtFlds extends ExtFldsSerialized { 
   

								private long extPricePlan;

								private long extSfo;

						private char[] extMarketCd = new char[4];

						private char[] extMinId = new char[10];
	
	/**
	* Constructor for ExtFlds
	**/
    public ExtFlds() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ExtFlds. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtFlds(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setExtPricePlan(1234L);
								setExtSfo(8691L);
								setExtMarketCd(("----").toCharArray());
								setExtMinId(("TMOB  D---").toCharArray());
    } 

	/**
	 *	Returns the value of extPricePlan
	 *	@return extPricePlan
	 */
	public long getExtPricePlan() throws CFException {
       if (isExtPricePlanModified()) { 
           extPricePlan = refreshExtPricePlan();
        }
   		return extPricePlan;
	}
	

	
	   
	/**
	 * 	Update ExtPricePlan with the passed value
	 *  Corresponding COBOL Variable is WS-EXT-PRICE-PLAN
	 *	@param number
	 */
	public void setExtPricePlan(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    extPricePlan = checkExtPricePlanMaxLimit(number); 
		serializeExtPricePlan(extPricePlan);
	}
	

	/**
	 * 	Update ExtPricePlan with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtPricePlan(char[] value) throws CFException {
		 extPricePlan = serializeExtPricePlan(value);
	}
	/**
	 * 	Update ExtPricePlan with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtPricePlanString(char[] value) throws CFException {
		 setExtPricePlan(value);
	}
	/**
	 *	Returns the value of extSfo
	 *	@return extSfo
	 */
	public long getExtSfo() throws CFException {
       if (isExtSfoModified()) { 
           extSfo = refreshExtSfo();
        }
   		return extSfo;
	}
	

	
	   
	/**
	 * 	Update ExtSfo with the passed value
	 *  Corresponding COBOL Variable is WS-EXT-SFO
	 *	@param number
	 */
	public void setExtSfo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    extSfo = checkExtSfoMaxLimit(number); 
		serializeExtSfo(extSfo);
	}
	

	/**
	 * 	Update ExtSfo with the passed value
	 *	@param value (String or char[])
	 */
	public void setExtSfo(char[] value) throws CFException {
		 extSfo = serializeExtSfo(value);
	}
	/**
	 * 	Update ExtSfo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setExtSfoString(char[] value) throws CFException {
		 setExtSfo(value);
	}
	/**
	 *	Returns the value of extMarketCd
	 *	@return extMarketCd
	 */
   public char[] getExtMarketCd() throws CFException{
     if (isExtMarketCdModified()) { 
        extMarketCd = refreshExtMarketCd();
     }
   		return extMarketCd;
   }

  
	/**
	*  set variable extMarketCd
	*  Corresponding COBOL Variable is WS-EXT-MARKET-CD
	*  @param value
	**/
   public void setExtMarketCd(char[] value) {
      extMarketCd = checkExtMarketCdConstraints(value);
      serializeExtMarketCd(extMarketCd);
   } 

     /**
	 * 	Update ExtMarketCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMarketCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtMarketCd,extMarketCd.length);
   	
   }
   
   public void setExtMarketCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtMarketCd,extMarketCd.length);
   	
   }
   
     /**
	 * 	Update ExtMarketCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMarketCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMarketCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtMarketCd with another Field
	 *	@param value
	 */
   public void setExtMarketCd(Field source) {
       replace(source,0,source.length(),beginExtMarketCd,EXT_MARKET_CD_LEN);
   	
   }  
   
     /**
	 * 	Update ExtMarketCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMarketCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtMarketCd,EXT_MARKET_CD_LEN);
   	
   }
   
     /**
	 * 	Update ExtMarketCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMarketCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMarketCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of extMinId
	 *	@return extMinId
	 */
   public char[] getExtMinId() throws CFException{
     if (isExtMinIdModified()) { 
        extMinId = refreshExtMinId();
     }
   		return extMinId;
   }

  
	/**
	*  set variable extMinId
	*  Corresponding COBOL Variable is WS-EXT-MIN-ID
	*  @param value
	**/
   public void setExtMinId(char[] value) {
      extMinId = checkExtMinIdConstraints(value);
      serializeExtMinId(extMinId);
   } 

     /**
	 * 	Update ExtMinId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExtMinId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExtMinId,extMinId.length);
   	
   }
   
   public void setExtMinId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExtMinId,extMinId.length);
   	
   }
   
     /**
	 * 	Update ExtMinId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExtMinId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMinId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExtMinId with another Field
	 *	@param value
	 */
   public void setExtMinId(Field source) {
       replace(source,0,source.length(),beginExtMinId,EXT_MIN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update ExtMinId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExtMinId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExtMinId,EXT_MIN_ID_LEN);
   	
   }
   
     /**
	 * 	Update ExtMinId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExtMinId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExtMinId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getExtFldsFieldLength() {
			return EXT_FLDS_LENGTH;
		}

}
  
