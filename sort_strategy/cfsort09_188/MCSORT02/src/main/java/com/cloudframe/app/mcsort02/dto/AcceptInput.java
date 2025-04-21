package com.cloudframe.app.mcsort02.dto;

/**
*  The class AcceptInput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:57. using version 5.0.0.256
**/


import com.cloudframe.app.mcsort02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AcceptInput extends AcceptInputSerialized {
   

						private char[] ddname = Field.fillLowValue(8);
	
	/**
	* Constructor for AcceptInput
	**/
    public AcceptInput() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ddname
	 *	@return ddname
	 */
   public char[] getDdname() throws CFException{
     if (isDdnameModified()) { 
        ddname = refreshDdname();
     }
   		return ddname;
   }

  
	/**
	*  set variable ddname
	*  Corresponding COBOL Variable is WS-DDNAME
	*  @param value
	**/
   public void setDdname(char[] value) {
      ddname = checkDdnameConstraints(value);
      serializeDdname(ddname);
   } 

     /**
	 * 	Update Ddname 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDdname(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDdname,ddname.length);
   	
   }
   
   public void setDdname(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDdname,ddname.length);
   	
   }
   
     /**
	 * 	Update Ddname 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDdname(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDdname+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ddname with another Field
	 *	@param value
	 */
   public void setDdname(Field source) {
       replace(source,0,source.length(),beginDdname,DDNAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ddname 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDdname(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDdname,DDNAME_LEN);
   	
   }
   
     /**
	 * 	Update Ddname 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDdname(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDdname+targetIndex,targetLen);
    
   }
	char[] sys00288Value = "SYS002  ".toCharArray();
	/**
	 *	Test condition "SYS002" for isSys002()
	 *	@return  Returns true if isSys002() is "SYS002"
	 */
   public boolean isSys002() throws CFException {
      return (  compareChars( getDdname() , sys00288Value)  == 0  );
   }


	/**
	*  set values "SYS002"
	*/
   	public void setSys002True() {  			
    	setDdname( sys00288Value);
   	}
	char[] sys00488Value = "SYS004  ".toCharArray();
	/**
	 *	Test condition "SYS004" for isSys004()
	 *	@return  Returns true if isSys004() is "SYS004"
	 */
   public boolean isSys004() throws CFException {
      return (  compareChars( getDdname() , sys00488Value)  == 0  );
   }


	/**
	*  set values "SYS004"
	*/
   	public void setSys004True() {  			
    	setDdname( sys00488Value);
   	}
	char[] sys00588Value = "SYS005  ".toCharArray();
	/**
	 *	Test condition "SYS005" for isSys005()
	 *	@return  Returns true if isSys005() is "SYS005"
	 */
   public boolean isSys005() throws CFException {
      return (  compareChars( getDdname() , sys00588Value)  == 0  );
   }


	/**
	*  set values "SYS005"
	*/
   	public void setSys005True() {  			
    	setDdname( sys00588Value);
   	}

	
	
	

		public static int getAcceptInputFieldLength() {
			return ACCEPT_INPUT_LENGTH;
		}

}
  
