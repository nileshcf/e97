package com.cloudframe.app.cpsc4.dto;

/**
*  The class DriftData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.cpsc4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DriftData extends DriftDataSerialized { 
   

						private char[] mdlDriftBandTyCd = Field.fillLowValue(1);


						private char[] mdlDriftTyCd = Field.fillLowValue(1);


								private char[] allocTrgtFromPct = Field.fillLowValue(3);


								private char[] allocTrgtToPct = Field.fillLowValue(3);


								private char[] minDriftPct = Field.fillLowValue(7);


								private char[] maxDriftPct = Field.fillLowValue(7);

	
	/**
	* Constructor for DriftData
	**/
    public DriftData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DriftData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DriftData(Field parent,int begin) {
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
             , getStartOffset() + 3
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 7
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 11
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 19
             ,1
             );
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 27
             ,1
             );
    } 

	/**
	 *	Returns the value of mdlDriftBandTyCd
	 *	@return mdlDriftBandTyCd
	 */
   public char[] getMdlDriftBandTyCd() throws CFException{
     if (isMdlDriftBandTyCdModified()) { 
        mdlDriftBandTyCd = refreshMdlDriftBandTyCd();
     }
   		return mdlDriftBandTyCd;
   }

  
	/**
	*  set variable mdlDriftBandTyCd
	*  Corresponding COBOL Variable is WS-MDL-DRIFT-BAND-TY-CD
	*  @param value
	**/
   public void setMdlDriftBandTyCd(char[] value) {
      mdlDriftBandTyCd = checkMdlDriftBandTyCdConstraints(value);
      serializeMdlDriftBandTyCd(mdlDriftBandTyCd);
   } 

     /**
	 * 	Update MdlDriftBandTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMdlDriftBandTyCd,mdlDriftBandTyCd.length);
   	
   }
   
   public void setMdlDriftBandTyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMdlDriftBandTyCd,mdlDriftBandTyCd.length);
   	
   }
   
     /**
	 * 	Update MdlDriftBandTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlDriftBandTyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MdlDriftBandTyCd with another Field
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(Field source) {
       replace(source,0,source.length(),beginMdlDriftBandTyCd,MDL_DRIFT_BAND_TY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update MdlDriftBandTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMdlDriftBandTyCd,MDL_DRIFT_BAND_TY_CD_LEN);
   	
   }
   
     /**
	 * 	Update MdlDriftBandTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlDriftBandTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlDriftBandTyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mdlDriftTyCd
	 *	@return mdlDriftTyCd
	 */
   public char[] getMdlDriftTyCd() throws CFException{
     if (isMdlDriftTyCdModified()) { 
        mdlDriftTyCd = refreshMdlDriftTyCd();
     }
   		return mdlDriftTyCd;
   }

  
	/**
	*  set variable mdlDriftTyCd
	*  Corresponding COBOL Variable is WS-MDL-DRIFT-TY-CD
	*  @param value
	**/
   public void setMdlDriftTyCd(char[] value) {
      mdlDriftTyCd = checkMdlDriftTyCdConstraints(value);
      serializeMdlDriftTyCd(mdlDriftTyCd);
   } 

     /**
	 * 	Update MdlDriftTyCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMdlDriftTyCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMdlDriftTyCd,mdlDriftTyCd.length);
   	
   }
   
   public void setMdlDriftTyCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMdlDriftTyCd,mdlDriftTyCd.length);
   	
   }
   
     /**
	 * 	Update MdlDriftTyCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMdlDriftTyCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlDriftTyCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MdlDriftTyCd with another Field
	 *	@param value
	 */
   public void setMdlDriftTyCd(Field source) {
       replace(source,0,source.length(),beginMdlDriftTyCd,MDL_DRIFT_TY_CD_LEN);
   	
   }  
   
     /**
	 * 	Update MdlDriftTyCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMdlDriftTyCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMdlDriftTyCd,MDL_DRIFT_TY_CD_LEN);
   	
   }
   
     /**
	 * 	Update MdlDriftTyCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMdlDriftTyCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMdlDriftTyCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of allocTrgtFromPct
	 *	@return allocTrgtFromPct
	 */
   public char[] getAllocTrgtFromPct() throws CFException{
     if (isAllocTrgtFromPctModified()) { 
        allocTrgtFromPct = refreshAllocTrgtFromPct();
     }
   		return allocTrgtFromPct;
   }

  
	/**
	*  set variable allocTrgtFromPct
	*  Corresponding COBOL Variable is WS-ALLOC-TRGT-FROM-PCT
	*  @param value
	**/
   public void setAllocTrgtFromPct(char[] value) {
      allocTrgtFromPct = checkAllocTrgtFromPctConstraints(value);
      serializeAllocTrgtFromPct(allocTrgtFromPct);
   } 

     /**
	 * 	Update AllocTrgtFromPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAllocTrgtFromPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAllocTrgtFromPct,allocTrgtFromPct.length);
   	
   }
   
   public void setAllocTrgtFromPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAllocTrgtFromPct,allocTrgtFromPct.length);
   	
   }
   
     /**
	 * 	Update AllocTrgtFromPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAllocTrgtFromPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAllocTrgtFromPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AllocTrgtFromPct with another Field
	 *	@param value
	 */
   public void setAllocTrgtFromPct(Field source) {
       replace(source,0,source.length(),beginAllocTrgtFromPct,ALLOC_TRGT_FROM_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update AllocTrgtFromPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAllocTrgtFromPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAllocTrgtFromPct,ALLOC_TRGT_FROM_PCT_LEN);
   	
   }
   
     /**
	 * 	Update AllocTrgtFromPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAllocTrgtFromPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAllocTrgtFromPct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of allocTrgtToPct
	 *	@return allocTrgtToPct
	 */
   public char[] getAllocTrgtToPct() throws CFException{
     if (isAllocTrgtToPctModified()) { 
        allocTrgtToPct = refreshAllocTrgtToPct();
     }
   		return allocTrgtToPct;
   }

  
	/**
	*  set variable allocTrgtToPct
	*  Corresponding COBOL Variable is WS-ALLOC-TRGT-TO-PCT
	*  @param value
	**/
   public void setAllocTrgtToPct(char[] value) {
      allocTrgtToPct = checkAllocTrgtToPctConstraints(value);
      serializeAllocTrgtToPct(allocTrgtToPct);
   } 

     /**
	 * 	Update AllocTrgtToPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAllocTrgtToPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAllocTrgtToPct,allocTrgtToPct.length);
   	
   }
   
   public void setAllocTrgtToPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAllocTrgtToPct,allocTrgtToPct.length);
   	
   }
   
     /**
	 * 	Update AllocTrgtToPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAllocTrgtToPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAllocTrgtToPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AllocTrgtToPct with another Field
	 *	@param value
	 */
   public void setAllocTrgtToPct(Field source) {
       replace(source,0,source.length(),beginAllocTrgtToPct,ALLOC_TRGT_TO_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update AllocTrgtToPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAllocTrgtToPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAllocTrgtToPct,ALLOC_TRGT_TO_PCT_LEN);
   	
   }
   
     /**
	 * 	Update AllocTrgtToPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAllocTrgtToPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAllocTrgtToPct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of minDriftPct
	 *	@return minDriftPct
	 */
   public char[] getMinDriftPct() throws CFException{
     if (isMinDriftPctModified()) { 
        minDriftPct = refreshMinDriftPct();
     }
   		return minDriftPct;
   }

  
	/**
	*  set variable minDriftPct
	*  Corresponding COBOL Variable is WS-MIN-DRIFT-PCT
	*  @param value
	**/
   public void setMinDriftPct(char[] value) {
      minDriftPct = checkMinDriftPctConstraints(value);
      serializeMinDriftPct(minDriftPct);
   } 

     /**
	 * 	Update MinDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMinDriftPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMinDriftPct,minDriftPct.length);
   	
   }
   
   public void setMinDriftPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMinDriftPct,minDriftPct.length);
   	
   }
   
     /**
	 * 	Update MinDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMinDriftPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMinDriftPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MinDriftPct with another Field
	 *	@param value
	 */
   public void setMinDriftPct(Field source) {
       replace(source,0,source.length(),beginMinDriftPct,MIN_DRIFT_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update MinDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMinDriftPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMinDriftPct,MIN_DRIFT_PCT_LEN);
   	
   }
   
     /**
	 * 	Update MinDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMinDriftPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMinDriftPct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of maxDriftPct
	 *	@return maxDriftPct
	 */
   public char[] getMaxDriftPct() throws CFException{
     if (isMaxDriftPctModified()) { 
        maxDriftPct = refreshMaxDriftPct();
     }
   		return maxDriftPct;
   }

  
	/**
	*  set variable maxDriftPct
	*  Corresponding COBOL Variable is WS-MAX-DRIFT-PCT
	*  @param value
	**/
   public void setMaxDriftPct(char[] value) {
      maxDriftPct = checkMaxDriftPctConstraints(value);
      serializeMaxDriftPct(maxDriftPct);
   } 

     /**
	 * 	Update MaxDriftPct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMaxDriftPct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMaxDriftPct,maxDriftPct.length);
   	
   }
   
   public void setMaxDriftPct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMaxDriftPct,maxDriftPct.length);
   	
   }
   
     /**
	 * 	Update MaxDriftPct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMaxDriftPct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaxDriftPct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MaxDriftPct with another Field
	 *	@param value
	 */
   public void setMaxDriftPct(Field source) {
       replace(source,0,source.length(),beginMaxDriftPct,MAX_DRIFT_PCT_LEN);
   	
   }  
   
     /**
	 * 	Update MaxDriftPct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMaxDriftPct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMaxDriftPct,MAX_DRIFT_PCT_LEN);
   	
   }
   
     /**
	 * 	Update MaxDriftPct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMaxDriftPct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMaxDriftPct+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDriftDataFieldLength() {
			return DRIFT_DATA_LENGTH;
		}

}
  
