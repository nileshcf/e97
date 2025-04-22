package com.cloudframe.app.init1.dto;

/**
*  The class M2mMtn is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class M2mMtn extends M2mMtnSerialized { 
   

						private char[] m2mMtnNpa = new char[3];

						private char[] m2mMtnNxx = new char[3];

						private char[] m2mMtnTln = new char[4];
	
	/**
	* Constructor for M2mMtn
	**/
    public M2mMtn() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for M2mMtn. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public M2mMtn(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setM2mMtnNpa(fillSpace(3));
								setM2mMtnNxx(fillSpace(3));
								setM2mMtnTln(fillSpace(4));
    } 

	/**
	 *	Returns the value of m2mMtnNpa
	 *	@return m2mMtnNpa
	 */
   public char[] getM2mMtnNpa() throws CFException{
     if (isM2mMtnNpaModified()) { 
        m2mMtnNpa = refreshM2mMtnNpa();
     }
   		return m2mMtnNpa;
   }

  
	/**
	*  set variable m2mMtnNpa
	*  Corresponding COBOL Variable is WS-M2M-MTN-NPA
	*  @param value
	**/
   public void setM2mMtnNpa(char[] value) {
      m2mMtnNpa = checkM2mMtnNpaConstraints(value);
      serializeM2mMtnNpa(m2mMtnNpa);
   } 

     /**
	 * 	Update M2mMtnNpa 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setM2mMtnNpa(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginM2mMtnNpa,m2mMtnNpa.length);
   	
   }
   
   public void setM2mMtnNpa(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginM2mMtnNpa,m2mMtnNpa.length);
   	
   }
   
     /**
	 * 	Update M2mMtnNpa 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setM2mMtnNpa(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM2mMtnNpa+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update M2mMtnNpa with another Field
	 *	@param value
	 */
   public void setM2mMtnNpa(Field source) {
       replace(source,0,source.length(),beginM2mMtnNpa,M_2M_MTN_NPA_LEN);
   	
   }  
   
     /**
	 * 	Update M2mMtnNpa 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setM2mMtnNpa(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginM2mMtnNpa,M_2M_MTN_NPA_LEN);
   	
   }
   
     /**
	 * 	Update M2mMtnNpa 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setM2mMtnNpa(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM2mMtnNpa+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of m2mMtnNxx
	 *	@return m2mMtnNxx
	 */
   public char[] getM2mMtnNxx() throws CFException{
     if (isM2mMtnNxxModified()) { 
        m2mMtnNxx = refreshM2mMtnNxx();
     }
   		return m2mMtnNxx;
   }

  
	/**
	*  set variable m2mMtnNxx
	*  Corresponding COBOL Variable is WS-M2M-MTN-NXX
	*  @param value
	**/
   public void setM2mMtnNxx(char[] value) {
      m2mMtnNxx = checkM2mMtnNxxConstraints(value);
      serializeM2mMtnNxx(m2mMtnNxx);
   } 

     /**
	 * 	Update M2mMtnNxx 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setM2mMtnNxx(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginM2mMtnNxx,m2mMtnNxx.length);
   	
   }
   
   public void setM2mMtnNxx(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginM2mMtnNxx,m2mMtnNxx.length);
   	
   }
   
     /**
	 * 	Update M2mMtnNxx 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setM2mMtnNxx(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM2mMtnNxx+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update M2mMtnNxx with another Field
	 *	@param value
	 */
   public void setM2mMtnNxx(Field source) {
       replace(source,0,source.length(),beginM2mMtnNxx,M_2M_MTN_NXX_LEN);
   	
   }  
   
     /**
	 * 	Update M2mMtnNxx 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setM2mMtnNxx(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginM2mMtnNxx,M_2M_MTN_NXX_LEN);
   	
   }
   
     /**
	 * 	Update M2mMtnNxx 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setM2mMtnNxx(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM2mMtnNxx+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of m2mMtnTln
	 *	@return m2mMtnTln
	 */
   public char[] getM2mMtnTln() throws CFException{
     if (isM2mMtnTlnModified()) { 
        m2mMtnTln = refreshM2mMtnTln();
     }
   		return m2mMtnTln;
   }

  
	/**
	*  set variable m2mMtnTln
	*  Corresponding COBOL Variable is WS-M2M-MTN-TLN
	*  @param value
	**/
   public void setM2mMtnTln(char[] value) {
      m2mMtnTln = checkM2mMtnTlnConstraints(value);
      serializeM2mMtnTln(m2mMtnTln);
   } 

     /**
	 * 	Update M2mMtnTln 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setM2mMtnTln(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginM2mMtnTln,m2mMtnTln.length);
   	
   }
   
   public void setM2mMtnTln(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginM2mMtnTln,m2mMtnTln.length);
   	
   }
   
     /**
	 * 	Update M2mMtnTln 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setM2mMtnTln(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM2mMtnTln+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update M2mMtnTln with another Field
	 *	@param value
	 */
   public void setM2mMtnTln(Field source) {
       replace(source,0,source.length(),beginM2mMtnTln,M_2M_MTN_TLN_LEN);
   	
   }  
   
     /**
	 * 	Update M2mMtnTln 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setM2mMtnTln(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginM2mMtnTln,M_2M_MTN_TLN_LEN);
   	
   }
   
     /**
	 * 	Update M2mMtnTln 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setM2mMtnTln(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginM2mMtnTln+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes M2mMtn
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setM2mMtnNpa(CONSTANTS.SPACE_3);
         setM2mMtnNxx(CONSTANTS.SPACE_3);
         setM2mMtnTln(CONSTANTS.SPACE_4);
   }

		public static int getM2mMtnFieldLength() {
			return M_2M_MTN_LENGTH;
		}

}
  
