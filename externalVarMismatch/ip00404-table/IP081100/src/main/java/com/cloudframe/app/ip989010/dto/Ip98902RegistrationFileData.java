package com.cloudframe.app.ip989010.dto;

/**
*  The class Ip98902RegistrationFileData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip98902RegistrationFileData extends Ip98902RegistrationFileDataSerialized {
   

						private char[] ip98902PanAlias = Field.fillLowValue(36);

						private char[] ip98902Pan = Field.fillLowValue(16);

						private char[] ip98902Status = Field.fillLowValue(1);

								private int ip98902DonationAmount;

								private int ip98902DonationUpperLimit;

								private long ip98902CharityIca;
	
	/**
	* Constructor for Ip98902RegistrationFileData
	**/
    public Ip98902RegistrationFileData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip98902PanAlias
	 *	@return ip98902PanAlias
	 */
   public char[] getIp98902PanAlias() throws CFException{
     if (isIp98902PanAliasModified()) { 
        ip98902PanAlias = refreshIp98902PanAlias();
     }
   		return ip98902PanAlias;
   }

  
	/**
	*  set variable ip98902PanAlias
	*  Corresponding COBOL Variable is IP98902-PAN-ALIAS
	*  @param value
	**/
   public void setIp98902PanAlias(char[] value) {
      ip98902PanAlias = checkIp98902PanAliasConstraints(value);
      serializeIp98902PanAlias(ip98902PanAlias);
   } 

     /**
	 * 	Update Ip98902PanAlias 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98902PanAlias(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98902PanAlias,ip98902PanAlias.length);
   	
   }
   
   public void setIp98902PanAlias(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98902PanAlias,ip98902PanAlias.length);
   	
   }
   
     /**
	 * 	Update Ip98902PanAlias 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98902PanAlias(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98902PanAlias+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98902PanAlias with another Field
	 *	@param value
	 */
   public void setIp98902PanAlias(Field source) {
       replace(source,0,source.length(),beginIp98902PanAlias,IP_98902_PAN_ALIAS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98902PanAlias 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98902PanAlias(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98902PanAlias,IP_98902_PAN_ALIAS_LEN);
   	
   }
   
     /**
	 * 	Update Ip98902PanAlias 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98902PanAlias(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98902PanAlias+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98902Pan
	 *	@return ip98902Pan
	 */
   public char[] getIp98902Pan() throws CFException{
     if (isIp98902PanModified()) { 
        ip98902Pan = refreshIp98902Pan();
     }
   		return ip98902Pan;
   }

  
	/**
	*  set variable ip98902Pan
	*  Corresponding COBOL Variable is IP98902-PAN
	*  @param value
	**/
   public void setIp98902Pan(char[] value) {
      ip98902Pan = checkIp98902PanConstraints(value);
      serializeIp98902Pan(ip98902Pan);
   } 

     /**
	 * 	Update Ip98902Pan 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98902Pan(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98902Pan,ip98902Pan.length);
   	
   }
   
   public void setIp98902Pan(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98902Pan,ip98902Pan.length);
   	
   }
   
     /**
	 * 	Update Ip98902Pan 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98902Pan(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98902Pan+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98902Pan with another Field
	 *	@param value
	 */
   public void setIp98902Pan(Field source) {
       replace(source,0,source.length(),beginIp98902Pan,IP_98902_PAN_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98902Pan 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98902Pan(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98902Pan,IP_98902_PAN_LEN);
   	
   }
   
     /**
	 * 	Update Ip98902Pan 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98902Pan(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98902Pan+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip98902Status
	 *	@return ip98902Status
	 */
   public char[] getIp98902Status() throws CFException{
     if (isIp98902StatusModified()) { 
        ip98902Status = refreshIp98902Status();
     }
   		return ip98902Status;
   }

  
	/**
	*  set variable ip98902Status
	*  Corresponding COBOL Variable is IP98902-STATUS
	*  @param value
	**/
   public void setIp98902Status(char[] value) {
      ip98902Status = checkIp98902StatusConstraints(value);
      serializeIp98902Status(ip98902Status);
   } 

     /**
	 * 	Update Ip98902Status 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp98902Status(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp98902Status,ip98902Status.length);
   	
   }
   
   public void setIp98902Status(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp98902Status,ip98902Status.length);
   	
   }
   
     /**
	 * 	Update Ip98902Status 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp98902Status(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98902Status+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip98902Status with another Field
	 *	@param value
	 */
   public void setIp98902Status(Field source) {
       replace(source,0,source.length(),beginIp98902Status,IP_98902_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip98902Status 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp98902Status(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp98902Status,IP_98902_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip98902Status 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp98902Status(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp98902Status+targetIndex,targetLen);
    
   }
	char[] ip98902StatusActive8888Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isIp98902StatusActive88()
	 *	@return  Returns true if isIp98902StatusActive88() is "A"
	 */
   public boolean isIp98902StatusActive88() throws CFException {
      return (  compareChars( getIp98902Status() , ip98902StatusActive8888Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setIp98902StatusActive88True() {  			
    	setIp98902Status( ip98902StatusActive8888Value);
   	}
	char[] ip98902StatusInactive8888Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isIp98902StatusInactive88()
	 *	@return  Returns true if isIp98902StatusInactive88() is "I"
	 */
   public boolean isIp98902StatusInactive88() throws CFException {
      return (  compareChars( getIp98902Status() , ip98902StatusInactive8888Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setIp98902StatusInactive88True() {  			
    	setIp98902Status( ip98902StatusInactive8888Value);
   	}
	/**
	 *	Returns the value of ip98902DonationAmount
	 *	@return ip98902DonationAmount
	 */
	public int getIp98902DonationAmount() throws CFException {
       if (isIp98902DonationAmountModified()) { 
           ip98902DonationAmount = refreshIp98902DonationAmount();
        }
   		return ip98902DonationAmount;
	}
	

	
	   
	/**
	 * 	Update Ip98902DonationAmount with the passed value
	 *  Corresponding COBOL Variable is IP98902-DONATION-AMOUNT
	 *	@param number
	 */
	public void setIp98902DonationAmount(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip98902DonationAmount = checkIp98902DonationAmountMaxLimit(number); 
		serializeIp98902DonationAmount(ip98902DonationAmount);
	}
	

	public void setIp98902DonationAmount(long number) {
	    number = checkIp98902DonationAmountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp98902DonationAmount((int)number);
	}
	
	/**
	 * 	Update Ip98902DonationAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98902DonationAmount(char[] value) throws CFException {
		 ip98902DonationAmount = serializeIp98902DonationAmount(value);
	}
	/**
	 * 	Update Ip98902DonationAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98902DonationAmountString(char[] value) throws CFException {
		 setIp98902DonationAmount(value);
	}
	/**
	 *	Returns the value of ip98902DonationUpperLimit
	 *	@return ip98902DonationUpperLimit
	 */
	public int getIp98902DonationUpperLimit() throws CFException {
       if (isIp98902DonationUpperLimitModified()) { 
           ip98902DonationUpperLimit = refreshIp98902DonationUpperLimit();
        }
   		return ip98902DonationUpperLimit;
	}
	

	
	   
	/**
	 * 	Update Ip98902DonationUpperLimit with the passed value
	 *  Corresponding COBOL Variable is IP98902-DONATION-UPPER-LIMIT
	 *	@param number
	 */
	public void setIp98902DonationUpperLimit(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip98902DonationUpperLimit = checkIp98902DonationUpperLimitMaxLimit(number); 
		serializeIp98902DonationUpperLimit(ip98902DonationUpperLimit);
	}
	

	public void setIp98902DonationUpperLimit(long number) {
	    number = checkIp98902DonationUpperLimitMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp98902DonationUpperLimit((int)number);
	}
	
	/**
	 * 	Update Ip98902DonationUpperLimit with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98902DonationUpperLimit(char[] value) throws CFException {
		 ip98902DonationUpperLimit = serializeIp98902DonationUpperLimit(value);
	}
	/**
	 * 	Update Ip98902DonationUpperLimit with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98902DonationUpperLimitString(char[] value) throws CFException {
		 setIp98902DonationUpperLimit(value);
	}
	/**
	 *	Returns the value of ip98902CharityIca
	 *	@return ip98902CharityIca
	 */
	public long getIp98902CharityIca() throws CFException {
       if (isIp98902CharityIcaModified()) { 
           ip98902CharityIca = refreshIp98902CharityIca();
        }
   		return ip98902CharityIca;
	}
	

	
	   
	/**
	 * 	Update Ip98902CharityIca with the passed value
	 *  Corresponding COBOL Variable is IP98902-CHARITY-ICA
	 *	@param number
	 */
	public void setIp98902CharityIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip98902CharityIca = checkIp98902CharityIcaMaxLimit(number); 
		serializeIp98902CharityIca(ip98902CharityIca);
	}
	

	/**
	 * 	Update Ip98902CharityIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp98902CharityIca(char[] value) throws CFException {
		 ip98902CharityIca = serializeIp98902CharityIca(value);
	}
	/**
	 * 	Update Ip98902CharityIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp98902CharityIcaString(char[] value) throws CFException {
		 setIp98902CharityIca(value);
	}

	
	
	

		public static int getIp98902RegistrationFileDataFieldLength() {
			return IP_98902_REGISTRATION_FILE_DATA_LENGTH;
		}

}
  
