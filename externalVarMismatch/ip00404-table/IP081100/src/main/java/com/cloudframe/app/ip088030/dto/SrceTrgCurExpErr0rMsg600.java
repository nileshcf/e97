package com.cloudframe.app.ip088030.dto;

/**
*  The class SrceTrgCurExpErr0rMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip088030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SrceTrgCurExpErr0rMsg600 extends SrceTrgCurExpErr0rMsg600Serialized {
   



						private char[] srceCurrValue600 = new char[3];


						private char[] srceExpValue600 = new char[1];



						private char[] trgCurrValue600 = new char[3];


						private char[] trgExpValue600 = new char[1];
	
	/**
	* Constructor for SrceTrgCurExpErr0rMsg600
	**/
    public SrceTrgCurExpErr0rMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("CURRENCY CONV FAILED.").toCharArray()
             , getStartOffset() + 0
             ,21
             );
       replaceValue( // serialize and save the value
             ("SRC-CUR:").toCharArray()
             , getStartOffset() + 21
             ,8
             );
								setSrceCurrValue600(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 32
             ,1
             );
								setSrceExpValue600(fillSpace(1));
       replaceValue( // serialize and save the value
             (";").toCharArray()
             , getStartOffset() + 34
             ,1
             );
       replaceValue( // serialize and save the value
             ("TRG-CUR:").toCharArray()
             , getStartOffset() + 35
             ,8
             );
								setTrgCurrValue600(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 46
             ,1
             );
								setTrgExpValue600(fillSpace(1));
    }


 

	/**
	 *	Returns the value of srceCurrValue600
	 *	@return srceCurrValue600
	 */
   public char[] getSrceCurrValue600() throws CFException{
     if (isSrceCurrValue600Modified()) { 
        srceCurrValue600 = refreshSrceCurrValue600();
     }
   		return srceCurrValue600;
   }

  
	/**
	*  set variable srceCurrValue600
	*  Corresponding COBOL Variable is 600-SRCE-CURR-VALUE
	*  @param value
	**/
   public void setSrceCurrValue600(char[] value) {
      srceCurrValue600 = checkSrceCurrValue600Constraints(value);
      serializeSrceCurrValue600(srceCurrValue600);
   } 

     /**
	 * 	Update SrceCurrValue600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrceCurrValue600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSrceCurrValue600,srceCurrValue600.length);
   	
   }
   
   public void setSrceCurrValue600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSrceCurrValue600,srceCurrValue600.length);
   	
   }
   
     /**
	 * 	Update SrceCurrValue600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrceCurrValue600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrceCurrValue600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SrceCurrValue600 with another Field
	 *	@param value
	 */
   public void setSrceCurrValue600(Field source) {
       replace(source,0,source.length(),beginSrceCurrValue600,SRCE_CURR_VALUE_600_LEN);
   	
   }  
   
     /**
	 * 	Update SrceCurrValue600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrceCurrValue600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSrceCurrValue600,SRCE_CURR_VALUE_600_LEN);
   	
   }
   
     /**
	 * 	Update SrceCurrValue600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrceCurrValue600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrceCurrValue600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of srceExpValue600
	 *	@return srceExpValue600
	 */
   public char[] getSrceExpValue600() throws CFException{
     if (isSrceExpValue600Modified()) { 
        srceExpValue600 = refreshSrceExpValue600();
     }
   		return srceExpValue600;
   }

  
	/**
	*  set variable srceExpValue600
	*  Corresponding COBOL Variable is 600-SRCE-EXP-VALUE
	*  @param value
	**/
   public void setSrceExpValue600(char[] value) {
      srceExpValue600 = checkSrceExpValue600Constraints(value);
      serializeSrceExpValue600(srceExpValue600);
   } 

     /**
	 * 	Update SrceExpValue600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSrceExpValue600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSrceExpValue600,srceExpValue600.length);
   	
   }
   
   public void setSrceExpValue600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSrceExpValue600,srceExpValue600.length);
   	
   }
   
     /**
	 * 	Update SrceExpValue600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrceExpValue600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrceExpValue600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SrceExpValue600 with another Field
	 *	@param value
	 */
   public void setSrceExpValue600(Field source) {
       replace(source,0,source.length(),beginSrceExpValue600,SRCE_EXP_VALUE_600_LEN);
   	
   }  
   
     /**
	 * 	Update SrceExpValue600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSrceExpValue600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSrceExpValue600,SRCE_EXP_VALUE_600_LEN);
   	
   }
   
     /**
	 * 	Update SrceExpValue600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrceExpValue600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSrceExpValue600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of trgCurrValue600
	 *	@return trgCurrValue600
	 */
   public char[] getTrgCurrValue600() throws CFException{
     if (isTrgCurrValue600Modified()) { 
        trgCurrValue600 = refreshTrgCurrValue600();
     }
   		return trgCurrValue600;
   }

  
	/**
	*  set variable trgCurrValue600
	*  Corresponding COBOL Variable is 600-TRG-CURR-VALUE
	*  @param value
	**/
   public void setTrgCurrValue600(char[] value) {
      trgCurrValue600 = checkTrgCurrValue600Constraints(value);
      serializeTrgCurrValue600(trgCurrValue600);
   } 

     /**
	 * 	Update TrgCurrValue600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrgCurrValue600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrgCurrValue600,trgCurrValue600.length);
   	
   }
   
   public void setTrgCurrValue600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrgCurrValue600,trgCurrValue600.length);
   	
   }
   
     /**
	 * 	Update TrgCurrValue600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrgCurrValue600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrgCurrValue600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrgCurrValue600 with another Field
	 *	@param value
	 */
   public void setTrgCurrValue600(Field source) {
       replace(source,0,source.length(),beginTrgCurrValue600,TRG_CURR_VALUE_600_LEN);
   	
   }  
   
     /**
	 * 	Update TrgCurrValue600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrgCurrValue600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrgCurrValue600,TRG_CURR_VALUE_600_LEN);
   	
   }
   
     /**
	 * 	Update TrgCurrValue600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrgCurrValue600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrgCurrValue600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of trgExpValue600
	 *	@return trgExpValue600
	 */
   public char[] getTrgExpValue600() throws CFException{
     if (isTrgExpValue600Modified()) { 
        trgExpValue600 = refreshTrgExpValue600();
     }
   		return trgExpValue600;
   }

  
	/**
	*  set variable trgExpValue600
	*  Corresponding COBOL Variable is 600-TRG-EXP-VALUE
	*  @param value
	**/
   public void setTrgExpValue600(char[] value) {
      trgExpValue600 = checkTrgExpValue600Constraints(value);
      serializeTrgExpValue600(trgExpValue600);
   } 

     /**
	 * 	Update TrgExpValue600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTrgExpValue600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTrgExpValue600,trgExpValue600.length);
   	
   }
   
   public void setTrgExpValue600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTrgExpValue600,trgExpValue600.length);
   	
   }
   
     /**
	 * 	Update TrgExpValue600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTrgExpValue600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrgExpValue600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TrgExpValue600 with another Field
	 *	@param value
	 */
   public void setTrgExpValue600(Field source) {
       replace(source,0,source.length(),beginTrgExpValue600,TRG_EXP_VALUE_600_LEN);
   	
   }  
   
     /**
	 * 	Update TrgExpValue600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTrgExpValue600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTrgExpValue600,TRG_EXP_VALUE_600_LEN);
   	
   }
   
     /**
	 * 	Update TrgExpValue600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTrgExpValue600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTrgExpValue600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSrceTrgCurExpErr0rMsg600FieldLength() {
			return SRCE_TRG_CUR_EXP_ERR_0R_MSG_600_LENGTH;
		}

}
  
