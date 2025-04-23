package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamInfoParms850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DynamInfoParms850 extends DynamInfoParms850Serialized { 
   

						private char[] dynamInfoDd850 = new char[8];

						private char[] dynamInfoDsn850 = new char[44];

						private char[] dynamInfoMember850 = new char[8];

						private char[] dynamInfoStatus850 = new char[1];

						private char[] dynamInfoDisp850 = new char[1];

						private char[] dynamInfoCond850 = new char[1];

						private char[] dynamInfoDsorg850 = new char[2];

								private short dynamInfoLimit850;

						private char[] dynamInfoAttr850 = new char[1];

						private char[] dynamInfoEntry850 = new char[1];

						private char[] dynamInfoType850 = new char[1];
	
	/**
	* Constructor for DynamInfoParms850
	**/
    public DynamInfoParms850() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DynamInfoParms850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamInfoParms850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setDynamInfoDd850(fillSpace(8));
								setDynamInfoDsn850(fillSpace(44));
								setDynamInfoMember850(fillSpace(8));
								setDynamInfoStatus850(fillLowValue(1));
								setDynamInfoDisp850(fillLowValue(1));
								setDynamInfoCond850(fillLowValue(1));
								setDynamInfoDsorg850(getString(new byte[] {(byte)0x00,(byte)0x00}).toCharArray());
								setDynamInfoLimit850((short)0);
								setDynamInfoAttr850(fillLowValue(1));
								setDynamInfoEntry850(fillLowValue(1));
								setDynamInfoType850(fillLowValue(1));
    } 

	/**
	 *	Returns the value of dynamInfoDd850
	 *	@return dynamInfoDd850
	 */
   public char[] getDynamInfoDd850() throws CFException{
     if (isDynamInfoDd850Modified()) { 
        dynamInfoDd850 = refreshDynamInfoDd850();
     }
   		return dynamInfoDd850;
   }

  
	/**
	*  set variable dynamInfoDd850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-DD
	*  @param value
	**/
   public void setDynamInfoDd850(char[] value) {
      dynamInfoDd850 = checkDynamInfoDd850Constraints(value);
      serializeDynamInfoDd850(dynamInfoDd850);
   } 

     /**
	 * 	Update DynamInfoDd850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoDd850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoDd850,dynamInfoDd850.length);
   	
   }
   
   public void setDynamInfoDd850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDd850,dynamInfoDd850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoDd850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoDd850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDd850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoDd850 with another Field
	 *	@param value
	 */
   public void setDynamInfoDd850(Field source) {
       replace(source,0,source.length(),beginDynamInfoDd850,DYNAM_INFO_DD_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoDd850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoDd850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoDd850,DYNAM_INFO_DD_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoDd850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoDd850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDd850+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamInfoDsn850
	 *	@return dynamInfoDsn850
	 */
   public char[] getDynamInfoDsn850() throws CFException{
     if (isDynamInfoDsn850Modified()) { 
        dynamInfoDsn850 = refreshDynamInfoDsn850();
     }
   		return dynamInfoDsn850;
   }

  
	/**
	*  set variable dynamInfoDsn850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-DSN
	*  @param value
	**/
   public void setDynamInfoDsn850(char[] value) {
      dynamInfoDsn850 = checkDynamInfoDsn850Constraints(value);
      serializeDynamInfoDsn850(dynamInfoDsn850);
   } 

     /**
	 * 	Update DynamInfoDsn850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoDsn850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoDsn850,dynamInfoDsn850.length);
   	
   }
   
   public void setDynamInfoDsn850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDsn850,dynamInfoDsn850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoDsn850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoDsn850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDsn850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoDsn850 with another Field
	 *	@param value
	 */
   public void setDynamInfoDsn850(Field source) {
       replace(source,0,source.length(),beginDynamInfoDsn850,DYNAM_INFO_DSN_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoDsn850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoDsn850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoDsn850,DYNAM_INFO_DSN_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoDsn850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoDsn850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDsn850+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamInfoMember850
	 *	@return dynamInfoMember850
	 */
   public char[] getDynamInfoMember850() throws CFException{
     if (isDynamInfoMember850Modified()) { 
        dynamInfoMember850 = refreshDynamInfoMember850();
     }
   		return dynamInfoMember850;
   }

  
	/**
	*  set variable dynamInfoMember850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-MEMBER
	*  @param value
	**/
   public void setDynamInfoMember850(char[] value) {
      dynamInfoMember850 = checkDynamInfoMember850Constraints(value);
      serializeDynamInfoMember850(dynamInfoMember850);
   } 

     /**
	 * 	Update DynamInfoMember850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoMember850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoMember850,dynamInfoMember850.length);
   	
   }
   
   public void setDynamInfoMember850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoMember850,dynamInfoMember850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoMember850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoMember850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoMember850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoMember850 with another Field
	 *	@param value
	 */
   public void setDynamInfoMember850(Field source) {
       replace(source,0,source.length(),beginDynamInfoMember850,DYNAM_INFO_MEMBER_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoMember850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoMember850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoMember850,DYNAM_INFO_MEMBER_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoMember850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoMember850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoMember850+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamInfoStatus850
	 *	@return dynamInfoStatus850
	 */
   public char[] getDynamInfoStatus850() throws CFException{
     if (isDynamInfoStatus850Modified()) { 
        dynamInfoStatus850 = refreshDynamInfoStatus850();
     }
   		return dynamInfoStatus850;
   }

  
	/**
	*  set variable dynamInfoStatus850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-STATUS
	*  @param value
	**/
   public void setDynamInfoStatus850(char[] value) {
      dynamInfoStatus850 = checkDynamInfoStatus850Constraints(value);
      serializeDynamInfoStatus850(dynamInfoStatus850);
   } 

     /**
	 * 	Update DynamInfoStatus850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoStatus850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoStatus850,dynamInfoStatus850.length);
   	
   }
   
   public void setDynamInfoStatus850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoStatus850,dynamInfoStatus850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoStatus850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoStatus850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoStatus850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoStatus850 with another Field
	 *	@param value
	 */
   public void setDynamInfoStatus850(Field source) {
       replace(source,0,source.length(),beginDynamInfoStatus850,DYNAM_INFO_STATUS_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoStatus850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoStatus850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoStatus850,DYNAM_INFO_STATUS_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoStatus850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoStatus850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoStatus850+targetIndex,targetLen);
    
   }
	
	/**
	 *	Test condition new byte[] {(byte)0x01} for isDynamInfoStatusOld88850()
	 *	@return  Returns true if isDynamInfoStatusOld88850() is new byte[] {(byte)0x01}
	 */
   public boolean isDynamInfoStatusOld88850() throws CFException {
      return (  compareChars( getDynamInfoStatus850() , convertEbcdicBytes2Char(new byte[] {(byte)0x01}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x01}
	*/
   	public void setDynamInfoStatusOld88850True() {  			
    	setDynamInfoStatus850( "convertEbcdicBytes2Char(new byte[] {(byte)0x01})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x02} for isDynamInfoStatusMod88850()
	 *	@return  Returns true if isDynamInfoStatusMod88850() is new byte[] {(byte)0x02}
	 */
   public boolean isDynamInfoStatusMod88850() throws CFException {
      return (  compareChars( getDynamInfoStatus850() , convertEbcdicBytes2Char(new byte[] {(byte)0x02}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x02}
	*/
   	public void setDynamInfoStatusMod88850True() {  			
    	setDynamInfoStatus850( "convertEbcdicBytes2Char(new byte[] {(byte)0x02})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x04} for isDynamInfoStatusNew88850()
	 *	@return  Returns true if isDynamInfoStatusNew88850() is new byte[] {(byte)0x04}
	 */
   public boolean isDynamInfoStatusNew88850() throws CFException {
      return (  compareChars( getDynamInfoStatus850() , convertEbcdicBytes2Char(new byte[] {(byte)0x04}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x04}
	*/
   	public void setDynamInfoStatusNew88850True() {  			
    	setDynamInfoStatus850( "convertEbcdicBytes2Char(new byte[] {(byte)0x04})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x08} for isDynamInfoStatusShr88850()
	 *	@return  Returns true if isDynamInfoStatusShr88850() is new byte[] {(byte)0x08}
	 */
   public boolean isDynamInfoStatusShr88850() throws CFException {
      return (  compareChars( getDynamInfoStatus850() , convertEbcdicBytes2Char(new byte[] {(byte)0x08}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x08}
	*/
   	public void setDynamInfoStatusShr88850True() {  			
    	setDynamInfoStatus850( "convertEbcdicBytes2Char(new byte[] {(byte)0x08})".toCharArray());
   	}
	/**
	 *	Returns the value of dynamInfoDisp850
	 *	@return dynamInfoDisp850
	 */
   public char[] getDynamInfoDisp850() throws CFException{
     if (isDynamInfoDisp850Modified()) { 
        dynamInfoDisp850 = refreshDynamInfoDisp850();
     }
   		return dynamInfoDisp850;
   }

  
	/**
	*  set variable dynamInfoDisp850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-DISP
	*  @param value
	**/
   public void setDynamInfoDisp850(char[] value) {
      dynamInfoDisp850 = checkDynamInfoDisp850Constraints(value);
      serializeDynamInfoDisp850(dynamInfoDisp850);
   } 

     /**
	 * 	Update DynamInfoDisp850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoDisp850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoDisp850,dynamInfoDisp850.length);
   	
   }
   
   public void setDynamInfoDisp850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDisp850,dynamInfoDisp850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoDisp850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoDisp850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDisp850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoDisp850 with another Field
	 *	@param value
	 */
   public void setDynamInfoDisp850(Field source) {
       replace(source,0,source.length(),beginDynamInfoDisp850,DYNAM_INFO_DISP_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoDisp850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoDisp850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoDisp850,DYNAM_INFO_DISP_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoDisp850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoDisp850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDisp850+targetIndex,targetLen);
    
   }
	
	/**
	 *	Test condition new byte[] {(byte)0x01} for isDynamInfoDispUnctlg88850()
	 *	@return  Returns true if isDynamInfoDispUnctlg88850() is new byte[] {(byte)0x01}
	 */
   public boolean isDynamInfoDispUnctlg88850() throws CFException {
      return (  compareChars( getDynamInfoDisp850() , convertEbcdicBytes2Char(new byte[] {(byte)0x01}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x01}
	*/
   	public void setDynamInfoDispUnctlg88850True() {  			
    	setDynamInfoDisp850( "convertEbcdicBytes2Char(new byte[] {(byte)0x01})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x02} for isDynamInfoDispCatlg88850()
	 *	@return  Returns true if isDynamInfoDispCatlg88850() is new byte[] {(byte)0x02}
	 */
   public boolean isDynamInfoDispCatlg88850() throws CFException {
      return (  compareChars( getDynamInfoDisp850() , convertEbcdicBytes2Char(new byte[] {(byte)0x02}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x02}
	*/
   	public void setDynamInfoDispCatlg88850True() {  			
    	setDynamInfoDisp850( "convertEbcdicBytes2Char(new byte[] {(byte)0x02})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x04} for isDynamInfoDispDelete88850()
	 *	@return  Returns true if isDynamInfoDispDelete88850() is new byte[] {(byte)0x04}
	 */
   public boolean isDynamInfoDispDelete88850() throws CFException {
      return (  compareChars( getDynamInfoDisp850() , convertEbcdicBytes2Char(new byte[] {(byte)0x04}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x04}
	*/
   	public void setDynamInfoDispDelete88850True() {  			
    	setDynamInfoDisp850( "convertEbcdicBytes2Char(new byte[] {(byte)0x04})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x08} for isDynamInfoDispKeep88850()
	 *	@return  Returns true if isDynamInfoDispKeep88850() is new byte[] {(byte)0x08}
	 */
   public boolean isDynamInfoDispKeep88850() throws CFException {
      return (  compareChars( getDynamInfoDisp850() , convertEbcdicBytes2Char(new byte[] {(byte)0x08}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x08}
	*/
   	public void setDynamInfoDispKeep88850True() {  			
    	setDynamInfoDisp850( "convertEbcdicBytes2Char(new byte[] {(byte)0x08})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x10} for isDynamInfoDispPass88850()
	 *	@return  Returns true if isDynamInfoDispPass88850() is new byte[] {(byte)0x10}
	 */
   public boolean isDynamInfoDispPass88850() throws CFException {
      return (  compareChars( getDynamInfoDisp850() , convertEbcdicBytes2Char(new byte[] {(byte)0x10}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x10}
	*/
   	public void setDynamInfoDispPass88850True() {  			
    	setDynamInfoDisp850( "convertEbcdicBytes2Char(new byte[] {(byte)0x10})".toCharArray());
   	}
	/**
	 *	Returns the value of dynamInfoCond850
	 *	@return dynamInfoCond850
	 */
   public char[] getDynamInfoCond850() throws CFException{
     if (isDynamInfoCond850Modified()) { 
        dynamInfoCond850 = refreshDynamInfoCond850();
     }
   		return dynamInfoCond850;
   }

  
	/**
	*  set variable dynamInfoCond850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-COND
	*  @param value
	**/
   public void setDynamInfoCond850(char[] value) {
      dynamInfoCond850 = checkDynamInfoCond850Constraints(value);
      serializeDynamInfoCond850(dynamInfoCond850);
   } 

     /**
	 * 	Update DynamInfoCond850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoCond850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoCond850,dynamInfoCond850.length);
   	
   }
   
   public void setDynamInfoCond850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoCond850,dynamInfoCond850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoCond850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoCond850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoCond850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoCond850 with another Field
	 *	@param value
	 */
   public void setDynamInfoCond850(Field source) {
       replace(source,0,source.length(),beginDynamInfoCond850,DYNAM_INFO_COND_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoCond850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoCond850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoCond850,DYNAM_INFO_COND_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoCond850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoCond850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoCond850+targetIndex,targetLen);
    
   }
	
	/**
	 *	Test condition new byte[] {(byte)0x01} for isDynamInfoCondUnctlg88850()
	 *	@return  Returns true if isDynamInfoCondUnctlg88850() is new byte[] {(byte)0x01}
	 */
   public boolean isDynamInfoCondUnctlg88850() throws CFException {
      return (  compareChars( getDynamInfoCond850() , convertEbcdicBytes2Char(new byte[] {(byte)0x01}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x01}
	*/
   	public void setDynamInfoCondUnctlg88850True() {  			
    	setDynamInfoCond850( "convertEbcdicBytes2Char(new byte[] {(byte)0x01})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x02} for isDynamInfoCondCatlg88850()
	 *	@return  Returns true if isDynamInfoCondCatlg88850() is new byte[] {(byte)0x02}
	 */
   public boolean isDynamInfoCondCatlg88850() throws CFException {
      return (  compareChars( getDynamInfoCond850() , convertEbcdicBytes2Char(new byte[] {(byte)0x02}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x02}
	*/
   	public void setDynamInfoCondCatlg88850True() {  			
    	setDynamInfoCond850( "convertEbcdicBytes2Char(new byte[] {(byte)0x02})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x04} for isDynamInfoCondDelete88850()
	 *	@return  Returns true if isDynamInfoCondDelete88850() is new byte[] {(byte)0x04}
	 */
   public boolean isDynamInfoCondDelete88850() throws CFException {
      return (  compareChars( getDynamInfoCond850() , convertEbcdicBytes2Char(new byte[] {(byte)0x04}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x04}
	*/
   	public void setDynamInfoCondDelete88850True() {  			
    	setDynamInfoCond850( "convertEbcdicBytes2Char(new byte[] {(byte)0x04})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x08} for isDynamInfoCondKeep88850()
	 *	@return  Returns true if isDynamInfoCondKeep88850() is new byte[] {(byte)0x08}
	 */
   public boolean isDynamInfoCondKeep88850() throws CFException {
      return (  compareChars( getDynamInfoCond850() , convertEbcdicBytes2Char(new byte[] {(byte)0x08}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x08}
	*/
   	public void setDynamInfoCondKeep88850True() {  			
    	setDynamInfoCond850( "convertEbcdicBytes2Char(new byte[] {(byte)0x08})".toCharArray());
   	}
	/**
	 *	Returns the value of dynamInfoDsorg850
	 *	@return dynamInfoDsorg850
	 */
   public char[] getDynamInfoDsorg850() throws CFException{
     if (isDynamInfoDsorg850Modified()) { 
        dynamInfoDsorg850 = refreshDynamInfoDsorg850();
     }
   		return dynamInfoDsorg850;
   }

  
	/**
	*  set variable dynamInfoDsorg850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-DSORG
	*  @param value
	**/
   public void setDynamInfoDsorg850(char[] value) {
      dynamInfoDsorg850 = checkDynamInfoDsorg850Constraints(value);
      serializeDynamInfoDsorg850(dynamInfoDsorg850);
   } 

     /**
	 * 	Update DynamInfoDsorg850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoDsorg850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoDsorg850,dynamInfoDsorg850.length);
   	
   }
   
   public void setDynamInfoDsorg850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDsorg850,dynamInfoDsorg850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoDsorg850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoDsorg850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDsorg850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoDsorg850 with another Field
	 *	@param value
	 */
   public void setDynamInfoDsorg850(Field source) {
       replace(source,0,source.length(),beginDynamInfoDsorg850,DYNAM_INFO_DSORG_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoDsorg850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoDsorg850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoDsorg850,DYNAM_INFO_DSORG_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoDsorg850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoDsorg850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoDsorg850+targetIndex,targetLen);
    
   }
	
	/**
	 *	Test condition new byte[] {(byte)0x00,(byte)0x00} for isDynamInfoDsorgOther88850()
	 *	@return  Returns true if isDynamInfoDsorgOther88850() is new byte[] {(byte)0x00,(byte)0x00}
	 */
   public boolean isDynamInfoDsorgOther88850() throws CFException {
      return (  compareChars( getDynamInfoDsorg850() , convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00,(byte)0x00}
	*/
   	public void setDynamInfoDsorgOther88850True() {  			
    	setDynamInfoDsorg850( "convertEbcdicBytes2Char(new byte[] {(byte)0x00,(byte)0x00})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x02,(byte)0x00} for isDynamInfoDsorgPo88850()
	 *	@return  Returns true if isDynamInfoDsorgPo88850() is new byte[] {(byte)0x02,(byte)0x00}
	 */
   public boolean isDynamInfoDsorgPo88850() throws CFException {
      return (  compareChars( getDynamInfoDsorg850() , convertEbcdicBytes2Char(new byte[] {(byte)0x02,(byte)0x00}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x02,(byte)0x00}
	*/
   	public void setDynamInfoDsorgPo88850True() {  			
    	setDynamInfoDsorg850( "convertEbcdicBytes2Char(new byte[] {(byte)0x02,(byte)0x00})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x40,(byte)0x00} for isDynamInfoDsorgPs88850()
	 *	@return  Returns true if isDynamInfoDsorgPs88850() is new byte[] {(byte)0x40,(byte)0x00}
	 */
   public boolean isDynamInfoDsorgPs88850() throws CFException {
      return (  compareChars( getDynamInfoDsorg850() , convertEbcdicBytes2Char(new byte[] {(byte)0x40,(byte)0x00}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x40,(byte)0x00}
	*/
   	public void setDynamInfoDsorgPs88850True() {  			
    	setDynamInfoDsorg850( "convertEbcdicBytes2Char(new byte[] {(byte)0x40,(byte)0x00})".toCharArray());
   	}
	/**
	 *	Returns the value of dynamInfoLimit850
	 *	@return dynamInfoLimit850
	 */
	public short getDynamInfoLimit850() throws CFException {
        if (isDynamInfoLimit850Modified()) { 
           dynamInfoLimit850 = refreshDynamInfoLimit850();
        }
   		return dynamInfoLimit850;
	}
	
	/**
	 * 	Update DynamInfoLimit850 with the passed value
	 *  Corresponding COBOL Variable is 850-DYNAM-INFO-LIMIT
	 *	@param number
	 */
	public void setDynamInfoLimit850(short number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamInfoLimit850 = checkDynamInfoLimit850MaxLimit(number); 
		serializeDynamInfoLimit850(dynamInfoLimit850);
	}

	public void setDynamInfoLimit850(int number) {
	    number = checkDynamInfoLimit850MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDynamInfoLimit850((short)number);
	}
	public void setDynamInfoLimit850(long number) {
	    number = checkDynamInfoLimit850MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setDynamInfoLimit850((short)number);
	}
	

	/**
	 *	Returns the value of dynamInfoAttr850
	 *	@return dynamInfoAttr850
	 */
   public char[] getDynamInfoAttr850() throws CFException{
     if (isDynamInfoAttr850Modified()) { 
        dynamInfoAttr850 = refreshDynamInfoAttr850();
     }
   		return dynamInfoAttr850;
   }

  
	/**
	*  set variable dynamInfoAttr850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-ATTR
	*  @param value
	**/
   public void setDynamInfoAttr850(char[] value) {
      dynamInfoAttr850 = checkDynamInfoAttr850Constraints(value);
      serializeDynamInfoAttr850(dynamInfoAttr850);
   } 

     /**
	 * 	Update DynamInfoAttr850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoAttr850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoAttr850,dynamInfoAttr850.length);
   	
   }
   
   public void setDynamInfoAttr850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoAttr850,dynamInfoAttr850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoAttr850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoAttr850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoAttr850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoAttr850 with another Field
	 *	@param value
	 */
   public void setDynamInfoAttr850(Field source) {
       replace(source,0,source.length(),beginDynamInfoAttr850,DYNAM_INFO_ATTR_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoAttr850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoAttr850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoAttr850,DYNAM_INFO_ATTR_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoAttr850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoAttr850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoAttr850+targetIndex,targetLen);
    
   }
	
	/**
	 *	Test condition new byte[] {(byte)0x08} for isDynamInfoAttrDynam88850()
	 *	@return  Returns true if isDynamInfoAttrDynam88850() is new byte[] {(byte)0x08}
	 */
   public boolean isDynamInfoAttrDynam88850() throws CFException {
      return (  compareChars( getDynamInfoAttr850() , convertEbcdicBytes2Char(new byte[] {(byte)0x08}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x08}
	*/
   	public void setDynamInfoAttrDynam88850True() {  			
    	setDynamInfoAttr850( "convertEbcdicBytes2Char(new byte[] {(byte)0x08})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x10} for isDynamInfoAttrConv88850()
	 *	@return  Returns true if isDynamInfoAttrConv88850() is new byte[] {(byte)0x10}
	 */
   public boolean isDynamInfoAttrConv88850() throws CFException {
      return (  compareChars( getDynamInfoAttr850() , convertEbcdicBytes2Char(new byte[] {(byte)0x10}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x10}
	*/
   	public void setDynamInfoAttrConv88850True() {  			
    	setDynamInfoAttr850( "convertEbcdicBytes2Char(new byte[] {(byte)0x10})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x20} for isDynamInfoAttrPrmall88850()
	 *	@return  Returns true if isDynamInfoAttrPrmall88850() is new byte[] {(byte)0x20}
	 */
   public boolean isDynamInfoAttrPrmall88850() throws CFException {
      return (  compareChars( getDynamInfoAttr850() , convertEbcdicBytes2Char(new byte[] {(byte)0x20}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x20}
	*/
   	public void setDynamInfoAttrPrmall88850True() {  			
    	setDynamInfoAttr850( "convertEbcdicBytes2Char(new byte[] {(byte)0x20})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x40} for isDynamInfoAttrInUse88850()
	 *	@return  Returns true if isDynamInfoAttrInUse88850() is new byte[] {(byte)0x40}
	 */
   public boolean isDynamInfoAttrInUse88850() throws CFException {
      return (  compareChars( getDynamInfoAttr850() , convertEbcdicBytes2Char(new byte[] {(byte)0x40}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x40}
	*/
   	public void setDynamInfoAttrInUse88850True() {  			
    	setDynamInfoAttr850( "convertEbcdicBytes2Char(new byte[] {(byte)0x40})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x80} for isDynamInfoAttrPrmcon88850()
	 *	@return  Returns true if isDynamInfoAttrPrmcon88850() is new byte[] {(byte)0x80}
	 */
   public boolean isDynamInfoAttrPrmcon88850() throws CFException {
      return (  compareChars( getDynamInfoAttr850() , convertEbcdicBytes2Char(new byte[] {(byte)0x80}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x80}
	*/
   	public void setDynamInfoAttrPrmcon88850True() {  			
    	setDynamInfoAttr850( "convertEbcdicBytes2Char(new byte[] {(byte)0x80})".toCharArray());
   	}
	/**
	 *	Returns the value of dynamInfoEntry850
	 *	@return dynamInfoEntry850
	 */
   public char[] getDynamInfoEntry850() throws CFException{
     if (isDynamInfoEntry850Modified()) { 
        dynamInfoEntry850 = refreshDynamInfoEntry850();
     }
   		return dynamInfoEntry850;
   }

  
	/**
	*  set variable dynamInfoEntry850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-ENTRY
	*  @param value
	**/
   public void setDynamInfoEntry850(char[] value) {
      dynamInfoEntry850 = checkDynamInfoEntry850Constraints(value);
      serializeDynamInfoEntry850(dynamInfoEntry850);
   } 

     /**
	 * 	Update DynamInfoEntry850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoEntry850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoEntry850,dynamInfoEntry850.length);
   	
   }
   
   public void setDynamInfoEntry850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoEntry850,dynamInfoEntry850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoEntry850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoEntry850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoEntry850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoEntry850 with another Field
	 *	@param value
	 */
   public void setDynamInfoEntry850(Field source) {
       replace(source,0,source.length(),beginDynamInfoEntry850,DYNAM_INFO_ENTRY_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoEntry850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoEntry850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoEntry850,DYNAM_INFO_ENTRY_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoEntry850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoEntry850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoEntry850+targetIndex,targetLen);
    
   }
	char[] dynamInfoEntryMore8885088Value = fillLowValue(1);
	/**
	 *	Test condition new byte[] {(byte)0x00} for isDynamInfoEntryMore88850()
	 *	@return  Returns true if isDynamInfoEntryMore88850() is new byte[] {(byte)0x00}
	 */
   public boolean isDynamInfoEntryMore88850() throws CFException {
      return (  compareChars( getDynamInfoEntry850() , dynamInfoEntryMore8885088Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00}
	*/
   	public void setDynamInfoEntryMore88850True() {  			
    	setDynamInfoEntry850( dynamInfoEntryMore8885088Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x80} for isDynamInfoEntryLast88850()
	 *	@return  Returns true if isDynamInfoEntryLast88850() is new byte[] {(byte)0x80}
	 */
   public boolean isDynamInfoEntryLast88850() throws CFException {
      return (  compareChars( getDynamInfoEntry850() , convertEbcdicBytes2Char(new byte[] {(byte)0x80}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x80}
	*/
   	public void setDynamInfoEntryLast88850True() {  			
    	setDynamInfoEntry850( "convertEbcdicBytes2Char(new byte[] {(byte)0x80})".toCharArray());
   	}
	/**
	 *	Returns the value of dynamInfoType850
	 *	@return dynamInfoType850
	 */
   public char[] getDynamInfoType850() throws CFException{
     if (isDynamInfoType850Modified()) { 
        dynamInfoType850 = refreshDynamInfoType850();
     }
   		return dynamInfoType850;
   }

  
	/**
	*  set variable dynamInfoType850
	*  Corresponding COBOL Variable is 850-DYNAM-INFO-TYPE
	*  @param value
	**/
   public void setDynamInfoType850(char[] value) {
      dynamInfoType850 = checkDynamInfoType850Constraints(value);
      serializeDynamInfoType850(dynamInfoType850);
   } 

     /**
	 * 	Update DynamInfoType850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoType850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamInfoType850,dynamInfoType850.length);
   	
   }
   
   public void setDynamInfoType850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoType850,dynamInfoType850.length);
   	
   }
   
     /**
	 * 	Update DynamInfoType850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoType850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoType850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamInfoType850 with another Field
	 *	@param value
	 */
   public void setDynamInfoType850(Field source) {
       replace(source,0,source.length(),beginDynamInfoType850,DYNAM_INFO_TYPE_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamInfoType850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamInfoType850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamInfoType850,DYNAM_INFO_TYPE_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamInfoType850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoType850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamInfoType850+targetIndex,targetLen);
    
   }
	char[] dynamInfoTypeDataset8885088Value = fillLowValue(1);
	/**
	 *	Test condition new byte[] {(byte)0x00} for isDynamInfoTypeDataset88850()
	 *	@return  Returns true if isDynamInfoTypeDataset88850() is new byte[] {(byte)0x00}
	 */
   public boolean isDynamInfoTypeDataset88850() throws CFException {
      return (  compareChars( getDynamInfoType850() , dynamInfoTypeDataset8885088Value)  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x00}
	*/
   	public void setDynamInfoTypeDataset88850True() {  			
    	setDynamInfoType850( dynamInfoTypeDataset8885088Value);
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x10} for isDynamInfoTypeSysout88850()
	 *	@return  Returns true if isDynamInfoTypeSysout88850() is new byte[] {(byte)0x10}
	 */
   public boolean isDynamInfoTypeSysout88850() throws CFException {
      return (  compareChars( getDynamInfoType850() , convertEbcdicBytes2Char(new byte[] {(byte)0x10}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x10}
	*/
   	public void setDynamInfoTypeSysout88850True() {  			
    	setDynamInfoType850( "convertEbcdicBytes2Char(new byte[] {(byte)0x10})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x20} for isDynamInfoTypeSysrdr88850()
	 *	@return  Returns true if isDynamInfoTypeSysrdr88850() is new byte[] {(byte)0x20}
	 */
   public boolean isDynamInfoTypeSysrdr88850() throws CFException {
      return (  compareChars( getDynamInfoType850() , convertEbcdicBytes2Char(new byte[] {(byte)0x20}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x20}
	*/
   	public void setDynamInfoTypeSysrdr88850True() {  			
    	setDynamInfoType850( "convertEbcdicBytes2Char(new byte[] {(byte)0x20})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x40} for isDynamInfoTypeTerm88850()
	 *	@return  Returns true if isDynamInfoTypeTerm88850() is new byte[] {(byte)0x40}
	 */
   public boolean isDynamInfoTypeTerm88850() throws CFException {
      return (  compareChars( getDynamInfoType850() , convertEbcdicBytes2Char(new byte[] {(byte)0x40}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x40}
	*/
   	public void setDynamInfoTypeTerm88850True() {  			
    	setDynamInfoType850( "convertEbcdicBytes2Char(new byte[] {(byte)0x40})".toCharArray());
   	}
	
	/**
	 *	Test condition new byte[] {(byte)0x80} for isDynamInfoTypeDummy88850()
	 *	@return  Returns true if isDynamInfoTypeDummy88850() is new byte[] {(byte)0x80}
	 */
   public boolean isDynamInfoTypeDummy88850() throws CFException {
      return (  compareChars( getDynamInfoType850() , convertEbcdicBytes2Char(new byte[] {(byte)0x80}))  == 0  );
   }


	/**
	*  set values new byte[] {(byte)0x80}
	*/
   	public void setDynamInfoTypeDummy88850True() {  			
    	setDynamInfoType850( "convertEbcdicBytes2Char(new byte[] {(byte)0x80})".toCharArray());
   	}

	
	
	

		public static int getDynamInfoParms850FieldLength() {
			return DYNAM_INFO_PARMS_850_LENGTH;
		}

}
  
