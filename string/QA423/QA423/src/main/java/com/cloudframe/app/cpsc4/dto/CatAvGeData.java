package com.cloudframe.app.cpsc4.dto;

/**
*  The class CatAvGeData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:30. using version 5.0.0.257
**/


import com.cloudframe.app.cpsc4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CatAvGeData extends CatAvGeDataSerialized { 
   

						private char[] invstObjCd = Field.fillLowValue(1);


								private char[] invstPct = Field.fillLowValue(3);


								private char[] minTrgtDriftPct = Field.fillLowValue(6);


								private char[] maxTrgtDriftPct = Field.fillLowValue(6);

	
	/**
	* Constructor for CatAvGeData
	**/
    public CatAvGeData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CatAvGeData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CatAvGeData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 5
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 12
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 19
             ,1
             );
    } 

	/**
	 *	Returns the value of invstObjCd
	 *	@return invstObjCd
	 */
   public char[] getInvstObjCd() throws CFException{
     if (isInvstObjCdModified()) { 
        invstObjCd = refreshInvstObjCd();
     }
   		return invstObjCd;
   }

  
	/**
	*  set variable invstObjCd
	*  Corresponding COBOL Variable is WS-INVST-OBJ-CD
	*  @param value
	**/
   public void setInvstObjCd(char[] value) {
      invstObjCd = checkInvstObjCdConstraints(value);
      serializeInvstObjCd(invstObjCd);
   } 

     /**
	 * 	Update InvstObjCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInvstObjCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInvstObjCd,invstObjCd.length);
   	
   }
   
   public void setInvstObjCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInvstObjCd,invstObjCd.length);
   	
   }
   
     /**
	 * 	Update InvstObjCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInvstObjCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInvstObjCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InvstObjCd with another Field
	 *	@param value
	 */
   public void setInvstObjCd(Field source) {
       replace(source,0,source.length(),beginInvstObjCd,INVST_OBJ_CD_LEN);
   	
   }  
   
     /**
	 * 	Update InvstObjCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInvstObjCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInvstObjCd,INVST_OBJ_CD_LEN);
   	
   }
   
     /**
	 * 	Update InvstObjCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInvstObjCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInvstObjCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of invstPct
	 *	@return invstPct
	 */
   public char[] getInvstPct() throws CFException{
     if (isInvstPctModified()) { 
        invstPct = refreshInvstPct();
     }
   		return invstPct;
   }

  
	/**
	*  set variable invstPct
	*  Corresponding COBOL Variable is WS-INVST-PCT
	*  @param value
	**/
   public void setInvstPct(char[] value) {
      invstPct = checkInvstPctConstraints(value);
      serializeInvstPct(invstPct);
   } 

     /**
	 * 	Update InvstPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInvstPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInvstPct,invstPct.length);
   	
   }
   
   public void setInvstPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInvstPct,invstPct.length);
   	
   }
   
     /**
	 * 	Update InvstPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInvstPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInvstPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InvstPct with another Field
	 *	@param value
	 */
   public void setInvstPct(Field source) {
       replace(source,0,source.length(),beginInvstPct,INVST_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update InvstPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInvstPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInvstPct,INVST_PCT_LEN);
   	
   }
   
     /**
	 * 	Update InvstPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInvstPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInvstPct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of minTrgtDriftPct
	 *	@return minTrgtDriftPct
	 */
   public char[] getMinTrgtDriftPct() throws CFException{
     if (isMinTrgtDriftPctModified()) { 
        minTrgtDriftPct = refreshMinTrgtDriftPct();
     }
   		return minTrgtDriftPct;
   }

  
	/**
	*  set variable minTrgtDriftPct
	*  Corresponding COBOL Variable is WS-MIN-TRGT-DRIFT-PCT
	*  @param value
	**/
   public void setMinTrgtDriftPct(char[] value) {
      minTrgtDriftPct = checkMinTrgtDriftPctConstraints(value);
      serializeMinTrgtDriftPct(minTrgtDriftPct);
   } 

     /**
	 * 	Update MinTrgtDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMinTrgtDriftPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMinTrgtDriftPct,minTrgtDriftPct.length);
   	
   }
   
   public void setMinTrgtDriftPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMinTrgtDriftPct,minTrgtDriftPct.length);
   	
   }
   
     /**
	 * 	Update MinTrgtDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMinTrgtDriftPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMinTrgtDriftPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MinTrgtDriftPct with another Field
	 *	@param value
	 */
   public void setMinTrgtDriftPct(Field source) {
       replace(source,0,source.length(),beginMinTrgtDriftPct,MIN_TRGT_DRIFT_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update MinTrgtDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMinTrgtDriftPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMinTrgtDriftPct,MIN_TRGT_DRIFT_PCT_LEN);
   	
   }
   
     /**
	 * 	Update MinTrgtDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMinTrgtDriftPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMinTrgtDriftPct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of maxTrgtDriftPct
	 *	@return maxTrgtDriftPct
	 */
   public char[] getMaxTrgtDriftPct() throws CFException{
     if (isMaxTrgtDriftPctModified()) { 
        maxTrgtDriftPct = refreshMaxTrgtDriftPct();
     }
   		return maxTrgtDriftPct;
   }

  
	/**
	*  set variable maxTrgtDriftPct
	*  Corresponding COBOL Variable is WS-MAX-TRGT-DRIFT-PCT
	*  @param value
	**/
   public void setMaxTrgtDriftPct(char[] value) {
      maxTrgtDriftPct = checkMaxTrgtDriftPctConstraints(value);
      serializeMaxTrgtDriftPct(maxTrgtDriftPct);
   } 

     /**
	 * 	Update MaxTrgtDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMaxTrgtDriftPct,maxTrgtDriftPct.length);
   	
   }
   
   public void setMaxTrgtDriftPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMaxTrgtDriftPct,maxTrgtDriftPct.length);
   	
   }
   
     /**
	 * 	Update MaxTrgtDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaxTrgtDriftPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MaxTrgtDriftPct with another Field
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(Field source) {
       replace(source,0,source.length(),beginMaxTrgtDriftPct,MAX_TRGT_DRIFT_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update MaxTrgtDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMaxTrgtDriftPct,MAX_TRGT_DRIFT_PCT_LEN);
   	
   }
   
     /**
	 * 	Update MaxTrgtDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaxTrgtDriftPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaxTrgtDriftPct+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCatAvGeDataFieldLength() {
			return CAT_AV_GE_DATA_LENGTH;
		}

}
  
