package com.cloudframe.app.global.sharedvar;

/**
*  The class Cf20004TableDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Cf20004TableDataKey extends Cf20004TableDataKeySerialized { 
   

						private char[] cf20004Ab = Field.fillLowValue(3);
				private Cf20004Bs cf20004Bs = new Cf20004Bs();

						private char[] cf20004BsR = Field.fillLowValue(7);
	
	/**
	* Constructor for Cf20004TableDataKey
	**/
    public Cf20004TableDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Cf20004TableDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004TableDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cf20004Bs.setParent(this,getStartOffset() + 3);
    } 

	/**
	 *	Returns the value of cf20004Ab
	 *	@return cf20004Ab
	 */
   public char[] getCf20004Ab() throws CFException{
     if (isCf20004AbModified()) { 
        cf20004Ab = refreshCf20004Ab();
     }
   		return cf20004Ab;
   }

  
	/**
	*  set variable cf20004Ab
	*  Corresponding COBOL Variable is CF20004-AB
	*  @param value
	**/
   public void setCf20004Ab(char[] value) {
      cf20004Ab = checkCf20004AbConstraints(value);
      serializeCf20004Ab(cf20004Ab);
   } 

     /**
	 * 	Update Cf20004Ab 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf20004Ab(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCf20004Ab,cf20004Ab.length);
   	
   }
   
   public void setCf20004Ab(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004Ab,cf20004Ab.length);
   	
   }
   
     /**
	 * 	Update Cf20004Ab 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Ab(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004Ab+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cf20004Ab with another Field
	 *	@param value
	 */
   public void setCf20004Ab(Field source) {
       replace(source,0,source.length(),beginCf20004Ab,CF_20004_AB_LEN);
   	
   }  
   
     /**
	 * 	Update Cf20004Ab 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf20004Ab(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCf20004Ab,CF_20004_AB_LEN);
   	
   }
   
     /**
	 * 	Update Cf20004Ab 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Ab(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004Ab+targetIndex,targetLen);
    
   }
	char[] cf20004DefaultAb8888Value = "   ".toCharArray();
	/**
	 *	Test condition "   " for isCf20004DefaultAb88()
	 *	@return  Returns true if isCf20004DefaultAb88() is "   "
	 */
   public boolean isCf20004DefaultAb88() throws CFException {
      return (  compareChars( getCf20004Ab() , cf20004DefaultAb8888Value)  == 0  );
   }


	/**
	*  set values "   "
	*/
   	public void setCf20004DefaultAb88True() {  			
    	setCf20004Ab( cf20004DefaultAb8888Value);
   	}
	/**
	 *	Returns the value of cf20004Bs
	 *	@return cf20004Bs
	 */   
	 public Cf20004Bs getCf20004Bs() {
   	return cf20004Bs;
   }
   /**
	* 	Update Cf20004Bs with the passed value
	*   Corresponding COBOL Variable is CF20004-BS
	*	@param value
	*/
   public void setCf20004Bs(char[] value) {
      cf20004Bs.setString(value); 
   }   
    
     /**
	 * 	Update Cf20004Bs 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCf20004Bs(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004Bs.begin,cf20004Bs.length());
   }
   
     /**
	 * 	Update Cf20004Bs 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Bs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004Bs.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Cf20004Bs with another Field
	 *	@param value
	 */
   public void setCf20004Bs(Field source) {
   	replace(source,0,source.length(),cf20004Bs.begin,cf20004Bs.length());
   }  
   
     /**
	 * 	Update Cf20004Bs 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCf20004Bs(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cf20004Bs.begin,cf20004Bs.length());
   }
   
     /**
	 * 	Update Cf20004Bs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004Bs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cf20004Bs.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cf20004BsR
	 *	@return cf20004BsR
	 */
   public char[] getCf20004BsR() throws CFException{
     if (isCf20004BsRModified()) { 
        cf20004BsR = refreshCf20004BsR();
     }
   		return cf20004BsR;
   }

  
	/**
	*  set variable cf20004BsR
	*  Corresponding COBOL Variable is CF20004-BS-R
	*  @param value
	**/
   public void setCf20004BsR(char[] value) {
      cf20004BsR = checkCf20004BsRConstraints(value);
      serializeCf20004BsR(cf20004BsR);
   } 

     /**
	 * 	Update Cf20004BsR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCf20004BsR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCf20004BsR,cf20004BsR.length);
   	
   }
   
   public void setCf20004BsR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004BsR,cf20004BsR.length);
   	
   }
   
     /**
	 * 	Update Cf20004BsR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCf20004BsR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004BsR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Cf20004BsR with another Field
	 *	@param value
	 */
   public void setCf20004BsR(Field source) {
       replace(source,0,source.length(),beginCf20004BsR,CF_20004_BS_R_LEN);
   	
   }  
   
     /**
	 * 	Update Cf20004BsR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCf20004BsR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCf20004BsR,CF_20004_BS_R_LEN);
   	
   }
   
     /**
	 * 	Update Cf20004BsR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCf20004BsR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCf20004BsR+targetIndex,targetLen);
    
   }
	char[] cf20004DefaultBs8888Value = "0000000".toCharArray();
	/**
	 *	Test condition "0000000" for isCf20004DefaultBs88()
	 *	@return  Returns true if isCf20004DefaultBs88() is "0000000"
	 */
   public boolean isCf20004DefaultBs88() throws CFException {
      return (  compareChars( getCf20004BsR() , cf20004DefaultBs8888Value)  == 0  );
   }


	/**
	*  set values "0000000"
	*/
   	public void setCf20004DefaultBs88True() {  			
    	setCf20004BsR( cf20004DefaultBs8888Value);
   	}

	
	
	
	/**
	 * 	initializes Cf20004TableDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCf20004Ab(CONSTANTS.SPACE_3);
          cf20004Bs.initialize();
     
   }

		public static int getCf20004TableDataKeyFieldLength() {
			return CF_20004_TABLE_DATA_KEY_LENGTH;
		}

}
  
