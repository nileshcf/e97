package com.cloudframe.app.vsammon7.dto;

/**
*  The class IpaddrData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:00. using version 5.0.0.256
**/


import com.cloudframe.app.vsammon7.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IpaddrData extends IpaddrDataSerialized { 
   

						private char[] iIpaddr = Field.fillLowValue(15);
	
	/**
	* Constructor for IpaddrData
	**/
    public IpaddrData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IpaddrData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IpaddrData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of iIpaddr
	 *	@return iIpaddr
	 */
   public char[] getIIpaddr() throws CFException{
     if (isIIpaddrModified()) { 
        iIpaddr = refreshIIpaddr();
     }
   		return iIpaddr;
   }

  
	/**
	*  set variable iIpaddr
	*  Corresponding COBOL Variable is WS-I-IPADDR
	*  @param value
	**/
   public void setIIpaddr(char[] value) {
      iIpaddr = checkIIpaddrConstraints(value);
      serializeIIpaddr(iIpaddr);
   } 

     /**
	 * 	Update IIpaddr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIIpaddr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIIpaddr,iIpaddr.length);
   	
   }
   
   public void setIIpaddr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIIpaddr,iIpaddr.length);
   	
   }
   
     /**
	 * 	Update IIpaddr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIIpaddr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIIpaddr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IIpaddr with another Field
	 *	@param value
	 */
   public void setIIpaddr(Field source) {
       replace(source,0,source.length(),beginIIpaddr,I_IPADDR_LEN);
   	
   }  
   
     /**
	 * 	Update IIpaddr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIIpaddr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIIpaddr,I_IPADDR_LEN);
   	
   }
   
     /**
	 * 	Update IIpaddr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIIpaddr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIIpaddr+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIpaddrDataFieldLength() {
			return IPADDR_DATA_LENGTH;
		}

}
  
