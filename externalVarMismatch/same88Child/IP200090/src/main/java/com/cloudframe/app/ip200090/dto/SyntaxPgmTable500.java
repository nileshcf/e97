package com.cloudframe.app.ip200090.dto;

/**
*  The class SyntaxPgmTable500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:00. using version 5.0.0.256
**/


import com.cloudframe.app.ip200090.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SyntaxPgmTable500 extends SyntaxPgmTable500Serialized { 
   

						private char[] ptrIp200690500 = new char[8];

						private char[] syntaxIp200690Name500 = new char[8];

						private char[] ptrIp202330500 = new char[8];

						private char[] syntaxIp202330Name500 = new char[8];

						private char[] ptrIp209700500 = new char[8];

						private char[] syntaxIp209700Name500 = new char[8];

						private char[] ptrIp209720500 = new char[8];

						private char[] syntaxIp209720Name500 = new char[8];

						private char[] ptrIp218620500 = new char[8];

						private char[] syntaxIp218620Name500 = new char[8];

						private char[] ptrIp221080500 = new char[8];

						private char[] syntaxIp221080Name500 = new char[8];

						private char[] ptrIp223190500 = new char[8];

						private char[] syntaxIp223190Name500 = new char[8];

						private char[] ptrIp223870500 = new char[8];

						private char[] syntaxIp223870Name500 = new char[8];

						private char[] ptrIp202990500 = new char[8];

						private char[] syntaxIp202990Name500 = new char[8];
	
	/**
	* Constructor for SyntaxPgmTable500
	**/
    public SyntaxPgmTable500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SyntaxPgmTable500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SyntaxPgmTable500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPtrIp200690500(("IP200690").toCharArray());
								setSyntaxIp200690Name500(("IP200690").toCharArray());
								setPtrIp202330500(("IP202330").toCharArray());
								setSyntaxIp202330Name500(("IP202330").toCharArray());
								setPtrIp209700500(("IP209700").toCharArray());
								setSyntaxIp209700Name500(("IP209700").toCharArray());
								setPtrIp209720500(("IP209720").toCharArray());
								setSyntaxIp209720Name500(("IP209720").toCharArray());
								setPtrIp218620500(("IP218620").toCharArray());
								setSyntaxIp218620Name500(("IP218620").toCharArray());
								setPtrIp221080500(("IP221080").toCharArray());
								setSyntaxIp221080Name500(("IP221080").toCharArray());
								setPtrIp223190500(("IP223190").toCharArray());
								setSyntaxIp223190Name500(("IP223190").toCharArray());
								setPtrIp223870500(("IP223870").toCharArray());
								setSyntaxIp223870Name500(("IP223870").toCharArray());
								setPtrIp202990500(("IP202990").toCharArray());
								setSyntaxIp202990Name500(("IP202990").toCharArray());
    } 

	/**
	 *	Returns the value of ptrIp200690500
	 *	@return ptrIp200690500
	 */
   public char[] getPtrIp200690500() throws CFException{
     if (isPtrIp200690500Modified()) { 
        ptrIp200690500 = refreshPtrIp200690500();
     }
   		return ptrIp200690500;
   }

  
	/**
	*  set variable ptrIp200690500
	*  Corresponding COBOL Variable is 500-PTR-IP200690
	*  @param value
	**/
   public void setPtrIp200690500(char[] value) {
      ptrIp200690500 = checkPtrIp200690500Constraints(value);
      serializePtrIp200690500(ptrIp200690500);
   } 

     /**
	 * 	Update PtrIp200690500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp200690500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp200690500,ptrIp200690500.length);
   	
   }
   
   public void setPtrIp200690500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp200690500,ptrIp200690500.length);
   	
   }
   
     /**
	 * 	Update PtrIp200690500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp200690500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp200690500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp200690500 with another Field
	 *	@param value
	 */
   public void setPtrIp200690500(Field source) {
       replace(source,0,source.length(),beginPtrIp200690500,PTR_IP_200690500_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp200690500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp200690500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp200690500,PTR_IP_200690500_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp200690500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp200690500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp200690500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of syntaxIp200690Name500
	 *	@return syntaxIp200690Name500
	 */
   public char[] getSyntaxIp200690Name500() throws CFException{
     if (isSyntaxIp200690Name500Modified()) { 
        syntaxIp200690Name500 = refreshSyntaxIp200690Name500();
     }
   		return syntaxIp200690Name500;
   }

  
	/**
	*  set variable syntaxIp200690Name500
	*  Corresponding COBOL Variable is 500-SYNTAX-IP200690-NAME
	*  @param value
	**/
   public void setSyntaxIp200690Name500(char[] value) {
      syntaxIp200690Name500 = checkSyntaxIp200690Name500Constraints(value);
      serializeSyntaxIp200690Name500(syntaxIp200690Name500);
   } 

     /**
	 * 	Update SyntaxIp200690Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxIp200690Name500,syntaxIp200690Name500.length);
   	
   }
   
   public void setSyntaxIp200690Name500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp200690Name500,syntaxIp200690Name500.length);
   	
   }
   
     /**
	 * 	Update SyntaxIp200690Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp200690Name500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxIp200690Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(Field source) {
       replace(source,0,source.length(),beginSyntaxIp200690Name500,SYNTAX_IP_200690_NAME_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxIp200690Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxIp200690Name500,SYNTAX_IP_200690_NAME_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxIp200690Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp200690Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp200690Name500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptrIp202330500
	 *	@return ptrIp202330500
	 */
   public char[] getPtrIp202330500() throws CFException{
     if (isPtrIp202330500Modified()) { 
        ptrIp202330500 = refreshPtrIp202330500();
     }
   		return ptrIp202330500;
   }

  
	/**
	*  set variable ptrIp202330500
	*  Corresponding COBOL Variable is 500-PTR-IP202330
	*  @param value
	**/
   public void setPtrIp202330500(char[] value) {
      ptrIp202330500 = checkPtrIp202330500Constraints(value);
      serializePtrIp202330500(ptrIp202330500);
   } 

     /**
	 * 	Update PtrIp202330500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp202330500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp202330500,ptrIp202330500.length);
   	
   }
   
   public void setPtrIp202330500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp202330500,ptrIp202330500.length);
   	
   }
   
     /**
	 * 	Update PtrIp202330500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp202330500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp202330500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp202330500 with another Field
	 *	@param value
	 */
   public void setPtrIp202330500(Field source) {
       replace(source,0,source.length(),beginPtrIp202330500,PTR_IP_202330500_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp202330500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp202330500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp202330500,PTR_IP_202330500_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp202330500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp202330500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp202330500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of syntaxIp202330Name500
	 *	@return syntaxIp202330Name500
	 */
   public char[] getSyntaxIp202330Name500() throws CFException{
     if (isSyntaxIp202330Name500Modified()) { 
        syntaxIp202330Name500 = refreshSyntaxIp202330Name500();
     }
   		return syntaxIp202330Name500;
   }

  
	/**
	*  set variable syntaxIp202330Name500
	*  Corresponding COBOL Variable is 500-SYNTAX-IP202330-NAME
	*  @param value
	**/
   public void setSyntaxIp202330Name500(char[] value) {
      syntaxIp202330Name500 = checkSyntaxIp202330Name500Constraints(value);
      serializeSyntaxIp202330Name500(syntaxIp202330Name500);
   } 

     /**
	 * 	Update SyntaxIp202330Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxIp202330Name500,syntaxIp202330Name500.length);
   	
   }
   
   public void setSyntaxIp202330Name500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp202330Name500,syntaxIp202330Name500.length);
   	
   }
   
     /**
	 * 	Update SyntaxIp202330Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp202330Name500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxIp202330Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(Field source) {
       replace(source,0,source.length(),beginSyntaxIp202330Name500,SYNTAX_IP_202330_NAME_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxIp202330Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxIp202330Name500,SYNTAX_IP_202330_NAME_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxIp202330Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp202330Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp202330Name500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptrIp209700500
	 *	@return ptrIp209700500
	 */
   public char[] getPtrIp209700500() throws CFException{
     if (isPtrIp209700500Modified()) { 
        ptrIp209700500 = refreshPtrIp209700500();
     }
   		return ptrIp209700500;
   }

  
	/**
	*  set variable ptrIp209700500
	*  Corresponding COBOL Variable is 500-PTR-IP209700
	*  @param value
	**/
   public void setPtrIp209700500(char[] value) {
      ptrIp209700500 = checkPtrIp209700500Constraints(value);
      serializePtrIp209700500(ptrIp209700500);
   } 

     /**
	 * 	Update PtrIp209700500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp209700500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp209700500,ptrIp209700500.length);
   	
   }
   
   public void setPtrIp209700500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp209700500,ptrIp209700500.length);
   	
   }
   
     /**
	 * 	Update PtrIp209700500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp209700500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp209700500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp209700500 with another Field
	 *	@param value
	 */
   public void setPtrIp209700500(Field source) {
       replace(source,0,source.length(),beginPtrIp209700500,PTR_IP_209700500_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp209700500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp209700500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp209700500,PTR_IP_209700500_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp209700500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp209700500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp209700500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of syntaxIp209700Name500
	 *	@return syntaxIp209700Name500
	 */
   public char[] getSyntaxIp209700Name500() throws CFException{
     if (isSyntaxIp209700Name500Modified()) { 
        syntaxIp209700Name500 = refreshSyntaxIp209700Name500();
     }
   		return syntaxIp209700Name500;
   }

  
	/**
	*  set variable syntaxIp209700Name500
	*  Corresponding COBOL Variable is 500-SYNTAX-IP209700-NAME
	*  @param value
	**/
   public void setSyntaxIp209700Name500(char[] value) {
      syntaxIp209700Name500 = checkSyntaxIp209700Name500Constraints(value);
      serializeSyntaxIp209700Name500(syntaxIp209700Name500);
   } 

     /**
	 * 	Update SyntaxIp209700Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxIp209700Name500,syntaxIp209700Name500.length);
   	
   }
   
   public void setSyntaxIp209700Name500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp209700Name500,syntaxIp209700Name500.length);
   	
   }
   
     /**
	 * 	Update SyntaxIp209700Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp209700Name500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxIp209700Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(Field source) {
       replace(source,0,source.length(),beginSyntaxIp209700Name500,SYNTAX_IP_209700_NAME_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxIp209700Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxIp209700Name500,SYNTAX_IP_209700_NAME_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxIp209700Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp209700Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp209700Name500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptrIp209720500
	 *	@return ptrIp209720500
	 */
   public char[] getPtrIp209720500() throws CFException{
     if (isPtrIp209720500Modified()) { 
        ptrIp209720500 = refreshPtrIp209720500();
     }
   		return ptrIp209720500;
   }

  
	/**
	*  set variable ptrIp209720500
	*  Corresponding COBOL Variable is 500-PTR-IP209720
	*  @param value
	**/
   public void setPtrIp209720500(char[] value) {
      ptrIp209720500 = checkPtrIp209720500Constraints(value);
      serializePtrIp209720500(ptrIp209720500);
   } 

     /**
	 * 	Update PtrIp209720500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp209720500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp209720500,ptrIp209720500.length);
   	
   }
   
   public void setPtrIp209720500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp209720500,ptrIp209720500.length);
   	
   }
   
     /**
	 * 	Update PtrIp209720500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp209720500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp209720500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp209720500 with another Field
	 *	@param value
	 */
   public void setPtrIp209720500(Field source) {
       replace(source,0,source.length(),beginPtrIp209720500,PTR_IP_209720500_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp209720500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp209720500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp209720500,PTR_IP_209720500_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp209720500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp209720500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp209720500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of syntaxIp209720Name500
	 *	@return syntaxIp209720Name500
	 */
   public char[] getSyntaxIp209720Name500() throws CFException{
     if (isSyntaxIp209720Name500Modified()) { 
        syntaxIp209720Name500 = refreshSyntaxIp209720Name500();
     }
   		return syntaxIp209720Name500;
   }

  
	/**
	*  set variable syntaxIp209720Name500
	*  Corresponding COBOL Variable is 500-SYNTAX-IP209720-NAME
	*  @param value
	**/
   public void setSyntaxIp209720Name500(char[] value) {
      syntaxIp209720Name500 = checkSyntaxIp209720Name500Constraints(value);
      serializeSyntaxIp209720Name500(syntaxIp209720Name500);
   } 

     /**
	 * 	Update SyntaxIp209720Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxIp209720Name500,syntaxIp209720Name500.length);
   	
   }
   
   public void setSyntaxIp209720Name500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp209720Name500,syntaxIp209720Name500.length);
   	
   }
   
     /**
	 * 	Update SyntaxIp209720Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp209720Name500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxIp209720Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(Field source) {
       replace(source,0,source.length(),beginSyntaxIp209720Name500,SYNTAX_IP_209720_NAME_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxIp209720Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxIp209720Name500,SYNTAX_IP_209720_NAME_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxIp209720Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp209720Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp209720Name500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptrIp218620500
	 *	@return ptrIp218620500
	 */
   public char[] getPtrIp218620500() throws CFException{
     if (isPtrIp218620500Modified()) { 
        ptrIp218620500 = refreshPtrIp218620500();
     }
   		return ptrIp218620500;
   }

  
	/**
	*  set variable ptrIp218620500
	*  Corresponding COBOL Variable is 500-PTR-IP218620
	*  @param value
	**/
   public void setPtrIp218620500(char[] value) {
      ptrIp218620500 = checkPtrIp218620500Constraints(value);
      serializePtrIp218620500(ptrIp218620500);
   } 

     /**
	 * 	Update PtrIp218620500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp218620500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp218620500,ptrIp218620500.length);
   	
   }
   
   public void setPtrIp218620500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp218620500,ptrIp218620500.length);
   	
   }
   
     /**
	 * 	Update PtrIp218620500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp218620500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp218620500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp218620500 with another Field
	 *	@param value
	 */
   public void setPtrIp218620500(Field source) {
       replace(source,0,source.length(),beginPtrIp218620500,PTR_IP_218620500_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp218620500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp218620500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp218620500,PTR_IP_218620500_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp218620500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp218620500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp218620500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of syntaxIp218620Name500
	 *	@return syntaxIp218620Name500
	 */
   public char[] getSyntaxIp218620Name500() throws CFException{
     if (isSyntaxIp218620Name500Modified()) { 
        syntaxIp218620Name500 = refreshSyntaxIp218620Name500();
     }
   		return syntaxIp218620Name500;
   }

  
	/**
	*  set variable syntaxIp218620Name500
	*  Corresponding COBOL Variable is 500-SYNTAX-IP218620-NAME
	*  @param value
	**/
   public void setSyntaxIp218620Name500(char[] value) {
      syntaxIp218620Name500 = checkSyntaxIp218620Name500Constraints(value);
      serializeSyntaxIp218620Name500(syntaxIp218620Name500);
   } 

     /**
	 * 	Update SyntaxIp218620Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxIp218620Name500,syntaxIp218620Name500.length);
   	
   }
   
   public void setSyntaxIp218620Name500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp218620Name500,syntaxIp218620Name500.length);
   	
   }
   
     /**
	 * 	Update SyntaxIp218620Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp218620Name500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxIp218620Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(Field source) {
       replace(source,0,source.length(),beginSyntaxIp218620Name500,SYNTAX_IP_218620_NAME_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxIp218620Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxIp218620Name500,SYNTAX_IP_218620_NAME_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxIp218620Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp218620Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp218620Name500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptrIp221080500
	 *	@return ptrIp221080500
	 */
   public char[] getPtrIp221080500() throws CFException{
     if (isPtrIp221080500Modified()) { 
        ptrIp221080500 = refreshPtrIp221080500();
     }
   		return ptrIp221080500;
   }

  
	/**
	*  set variable ptrIp221080500
	*  Corresponding COBOL Variable is 500-PTR-IP221080
	*  @param value
	**/
   public void setPtrIp221080500(char[] value) {
      ptrIp221080500 = checkPtrIp221080500Constraints(value);
      serializePtrIp221080500(ptrIp221080500);
   } 

     /**
	 * 	Update PtrIp221080500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp221080500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp221080500,ptrIp221080500.length);
   	
   }
   
   public void setPtrIp221080500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp221080500,ptrIp221080500.length);
   	
   }
   
     /**
	 * 	Update PtrIp221080500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp221080500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp221080500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp221080500 with another Field
	 *	@param value
	 */
   public void setPtrIp221080500(Field source) {
       replace(source,0,source.length(),beginPtrIp221080500,PTR_IP_221080500_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp221080500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp221080500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp221080500,PTR_IP_221080500_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp221080500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp221080500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp221080500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of syntaxIp221080Name500
	 *	@return syntaxIp221080Name500
	 */
   public char[] getSyntaxIp221080Name500() throws CFException{
     if (isSyntaxIp221080Name500Modified()) { 
        syntaxIp221080Name500 = refreshSyntaxIp221080Name500();
     }
   		return syntaxIp221080Name500;
   }

  
	/**
	*  set variable syntaxIp221080Name500
	*  Corresponding COBOL Variable is 500-SYNTAX-IP221080-NAME
	*  @param value
	**/
   public void setSyntaxIp221080Name500(char[] value) {
      syntaxIp221080Name500 = checkSyntaxIp221080Name500Constraints(value);
      serializeSyntaxIp221080Name500(syntaxIp221080Name500);
   } 

     /**
	 * 	Update SyntaxIp221080Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxIp221080Name500,syntaxIp221080Name500.length);
   	
   }
   
   public void setSyntaxIp221080Name500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp221080Name500,syntaxIp221080Name500.length);
   	
   }
   
     /**
	 * 	Update SyntaxIp221080Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp221080Name500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxIp221080Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(Field source) {
       replace(source,0,source.length(),beginSyntaxIp221080Name500,SYNTAX_IP_221080_NAME_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxIp221080Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxIp221080Name500,SYNTAX_IP_221080_NAME_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxIp221080Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp221080Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp221080Name500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptrIp223190500
	 *	@return ptrIp223190500
	 */
   public char[] getPtrIp223190500() throws CFException{
     if (isPtrIp223190500Modified()) { 
        ptrIp223190500 = refreshPtrIp223190500();
     }
   		return ptrIp223190500;
   }

  
	/**
	*  set variable ptrIp223190500
	*  Corresponding COBOL Variable is 500-PTR-IP223190
	*  @param value
	**/
   public void setPtrIp223190500(char[] value) {
      ptrIp223190500 = checkPtrIp223190500Constraints(value);
      serializePtrIp223190500(ptrIp223190500);
   } 

     /**
	 * 	Update PtrIp223190500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp223190500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp223190500,ptrIp223190500.length);
   	
   }
   
   public void setPtrIp223190500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp223190500,ptrIp223190500.length);
   	
   }
   
     /**
	 * 	Update PtrIp223190500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp223190500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp223190500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp223190500 with another Field
	 *	@param value
	 */
   public void setPtrIp223190500(Field source) {
       replace(source,0,source.length(),beginPtrIp223190500,PTR_IP_223190500_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp223190500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp223190500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp223190500,PTR_IP_223190500_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp223190500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp223190500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp223190500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of syntaxIp223190Name500
	 *	@return syntaxIp223190Name500
	 */
   public char[] getSyntaxIp223190Name500() throws CFException{
     if (isSyntaxIp223190Name500Modified()) { 
        syntaxIp223190Name500 = refreshSyntaxIp223190Name500();
     }
   		return syntaxIp223190Name500;
   }

  
	/**
	*  set variable syntaxIp223190Name500
	*  Corresponding COBOL Variable is 500-SYNTAX-IP223190-NAME
	*  @param value
	**/
   public void setSyntaxIp223190Name500(char[] value) {
      syntaxIp223190Name500 = checkSyntaxIp223190Name500Constraints(value);
      serializeSyntaxIp223190Name500(syntaxIp223190Name500);
   } 

     /**
	 * 	Update SyntaxIp223190Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxIp223190Name500,syntaxIp223190Name500.length);
   	
   }
   
   public void setSyntaxIp223190Name500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp223190Name500,syntaxIp223190Name500.length);
   	
   }
   
     /**
	 * 	Update SyntaxIp223190Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp223190Name500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxIp223190Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(Field source) {
       replace(source,0,source.length(),beginSyntaxIp223190Name500,SYNTAX_IP_223190_NAME_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxIp223190Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxIp223190Name500,SYNTAX_IP_223190_NAME_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxIp223190Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp223190Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp223190Name500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptrIp223870500
	 *	@return ptrIp223870500
	 */
   public char[] getPtrIp223870500() throws CFException{
     if (isPtrIp223870500Modified()) { 
        ptrIp223870500 = refreshPtrIp223870500();
     }
   		return ptrIp223870500;
   }

  
	/**
	*  set variable ptrIp223870500
	*  Corresponding COBOL Variable is 500-PTR-IP223870
	*  @param value
	**/
   public void setPtrIp223870500(char[] value) {
      ptrIp223870500 = checkPtrIp223870500Constraints(value);
      serializePtrIp223870500(ptrIp223870500);
   } 

     /**
	 * 	Update PtrIp223870500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp223870500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp223870500,ptrIp223870500.length);
   	
   }
   
   public void setPtrIp223870500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp223870500,ptrIp223870500.length);
   	
   }
   
     /**
	 * 	Update PtrIp223870500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp223870500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp223870500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp223870500 with another Field
	 *	@param value
	 */
   public void setPtrIp223870500(Field source) {
       replace(source,0,source.length(),beginPtrIp223870500,PTR_IP_223870500_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp223870500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp223870500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp223870500,PTR_IP_223870500_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp223870500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp223870500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp223870500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of syntaxIp223870Name500
	 *	@return syntaxIp223870Name500
	 */
   public char[] getSyntaxIp223870Name500() throws CFException{
     if (isSyntaxIp223870Name500Modified()) { 
        syntaxIp223870Name500 = refreshSyntaxIp223870Name500();
     }
   		return syntaxIp223870Name500;
   }

  
	/**
	*  set variable syntaxIp223870Name500
	*  Corresponding COBOL Variable is 500-SYNTAX-IP223870-NAME
	*  @param value
	**/
   public void setSyntaxIp223870Name500(char[] value) {
      syntaxIp223870Name500 = checkSyntaxIp223870Name500Constraints(value);
      serializeSyntaxIp223870Name500(syntaxIp223870Name500);
   } 

     /**
	 * 	Update SyntaxIp223870Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxIp223870Name500,syntaxIp223870Name500.length);
   	
   }
   
   public void setSyntaxIp223870Name500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp223870Name500,syntaxIp223870Name500.length);
   	
   }
   
     /**
	 * 	Update SyntaxIp223870Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp223870Name500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxIp223870Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(Field source) {
       replace(source,0,source.length(),beginSyntaxIp223870Name500,SYNTAX_IP_223870_NAME_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxIp223870Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxIp223870Name500,SYNTAX_IP_223870_NAME_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxIp223870Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp223870Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp223870Name500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ptrIp202990500
	 *	@return ptrIp202990500
	 */
   public char[] getPtrIp202990500() throws CFException{
     if (isPtrIp202990500Modified()) { 
        ptrIp202990500 = refreshPtrIp202990500();
     }
   		return ptrIp202990500;
   }

  
	/**
	*  set variable ptrIp202990500
	*  Corresponding COBOL Variable is 500-PTR-IP202990
	*  @param value
	**/
   public void setPtrIp202990500(char[] value) {
      ptrIp202990500 = checkPtrIp202990500Constraints(value);
      serializePtrIp202990500(ptrIp202990500);
   } 

     /**
	 * 	Update PtrIp202990500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPtrIp202990500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPtrIp202990500,ptrIp202990500.length);
   	
   }
   
   public void setPtrIp202990500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp202990500,ptrIp202990500.length);
   	
   }
   
     /**
	 * 	Update PtrIp202990500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp202990500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp202990500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PtrIp202990500 with another Field
	 *	@param value
	 */
   public void setPtrIp202990500(Field source) {
       replace(source,0,source.length(),beginPtrIp202990500,PTR_IP_202990500_LEN);
   	
   }  
   
     /**
	 * 	Update PtrIp202990500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPtrIp202990500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPtrIp202990500,PTR_IP_202990500_LEN);
   	
   }
   
     /**
	 * 	Update PtrIp202990500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPtrIp202990500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPtrIp202990500+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of syntaxIp202990Name500
	 *	@return syntaxIp202990Name500
	 */
   public char[] getSyntaxIp202990Name500() throws CFException{
     if (isSyntaxIp202990Name500Modified()) { 
        syntaxIp202990Name500 = refreshSyntaxIp202990Name500();
     }
   		return syntaxIp202990Name500;
   }

  
	/**
	*  set variable syntaxIp202990Name500
	*  Corresponding COBOL Variable is 500-SYNTAX-IP202990-NAME
	*  @param value
	**/
   public void setSyntaxIp202990Name500(char[] value) {
      syntaxIp202990Name500 = checkSyntaxIp202990Name500Constraints(value);
      serializeSyntaxIp202990Name500(syntaxIp202990Name500);
   } 

     /**
	 * 	Update SyntaxIp202990Name500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSyntaxIp202990Name500,syntaxIp202990Name500.length);
   	
   }
   
   public void setSyntaxIp202990Name500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp202990Name500,syntaxIp202990Name500.length);
   	
   }
   
     /**
	 * 	Update SyntaxIp202990Name500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp202990Name500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SyntaxIp202990Name500 with another Field
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(Field source) {
       replace(source,0,source.length(),beginSyntaxIp202990Name500,SYNTAX_IP_202990_NAME_500_LEN);
   	
   }  
   
     /**
	 * 	Update SyntaxIp202990Name500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSyntaxIp202990Name500,SYNTAX_IP_202990_NAME_500_LEN);
   	
   }
   
     /**
	 * 	Update SyntaxIp202990Name500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSyntaxIp202990Name500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSyntaxIp202990Name500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSyntaxPgmTable500FieldLength() {
			return SYNTAX_PGM_TABLE_500_LENGTH;
		}

}
  
