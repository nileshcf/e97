package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse5aTGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Wse5aTGroup extends Wse5aTGroupSerialized { 
   
					private Wse5aT wse5aT = new Wse5aT();

						private char[] wse5aTR = Field.fillLowValue(60);
	
	/**
	* Constructor for Wse5aTGroup
	**/
    public Wse5aTGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wse5aT.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse5aT
	 *	@return wse5aT
	 */   
	 public Wse5aT getWse5aT() {
   	return wse5aT;
   }
   /**
	* 	Update Wse5aT with the passed value
	*   Corresponding COBOL Variable is WSE-5A-T
	*	@param value
	*/
   public void setWse5aT(char[] value) {
      wse5aT.setString(value); 
   }   
    
     /**
	 * 	Update Wse5aT 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse5aT(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse5aT.begin,wse5aT.length());
   }
   
     /**
	 * 	Update Wse5aT 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5aT(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse5aT.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse5aT with another Field
	 *	@param value
	 */
   public void setWse5aT(Field source) {
   	replace(source,0,source.length(),wse5aT.begin,wse5aT.length());
   }  
   
     /**
	 * 	Update Wse5aT 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse5aT(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse5aT.begin,wse5aT.length());
   }
   
     /**
	 * 	Update Wse5aT 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5aT(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse5aT.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wse5aTR
	 *	@return wse5aTR
	 */
   public char[] getWse5aTR() throws CFException{
     if (isWse5aTRModified()) { 
        wse5aTR = refreshWse5aTR();
     }
   		return wse5aTR;
   }

  
	/**
	*  set variable wse5aTR
	*  Corresponding COBOL Variable is WSE-5A-T-R
	*  @param value
	**/
   public void setWse5aTR(char[] value) {
      wse5aTR = checkWse5aTRConstraints(value);
      serializeWse5aTR(wse5aTR);
   } 

     /**
	 * 	Update Wse5aTR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse5aTR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse5aTR,wse5aTR.length);
   	
   }
   
   public void setWse5aTR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse5aTR,wse5aTR.length);
   	
   }
   
     /**
	 * 	Update Wse5aTR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse5aTR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5aTR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse5aTR with another Field
	 *	@param value
	 */
   public void setWse5aTR(Field source) {
       replace(source,0,source.length(),beginWse5aTR,WSE_5A_TR_LEN);
   	
   }  
   
     /**
	 * 	Update Wse5aTR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse5aTR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse5aTR,WSE_5A_TR_LEN);
   	
   }
   
     /**
	 * 	Update Wse5aTR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse5aTR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse5aTR+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWse5aTGroupFieldLength() {
			return WSE_5A_TGROUP_LENGTH;
		}

}
  
