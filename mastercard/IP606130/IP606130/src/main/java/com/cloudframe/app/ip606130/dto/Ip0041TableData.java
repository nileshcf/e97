package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:24. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip0041TableData extends Ip0041TableDataSerialized { 
   

								private long ip0041Bin;

						private char[] ip0041Ab = Field.fillLowValue(3);

								private long ip0041Ica;

						private char[] ip0041FormatIndicator = Field.fillLowValue(1);

								private long ip0041Endpoint;

						private char[] ip0041PosMvInd = Field.fillLowValue(1);

						private char[] ip0041AtmMvInd = Field.fillLowValue(1);

						private char[] ip0041UcafInd = Field.fillLowValue(1);
				private Ip0041RegionTable ip0041RegionTable = new Ip0041RegionTable();
				private Ip0041CountryTable ip0041CountryTable = new Ip0041CountryTable();

						private char[] ip0041RePowerInd = Field.fillLowValue(1);

						private char[] ip0041DomDbtParticipSw = Field.fillLowValue(1);

						private char[] ip0041IchgAcqCd = Field.fillLowValue(1);

						private char[] ip0041MemberFiller = Field.fillLowValue(5);
				private Ip0041CentralSiteFields ip0041CentralSiteFields = new Ip0041CentralSiteFields();
	
	/**
	* Constructor for Ip0041TableData
	**/
    public Ip0041TableData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0041TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip0041RegionTable.setParent(this,getStartOffset() + 31);
	       			ip0041CountryTable.setParent(this,getStartOffset() + 37);
	       			ip0041CentralSiteFields.setParent(this,getStartOffset() + 105);
    } 

	/**
	 *	Returns the value of ip0041Bin
	 *	@return ip0041Bin
	 */
	public long getIp0041Bin() throws CFException {
       if (isIp0041BinModified()) { 
           ip0041Bin = refreshIp0041Bin();
        }
   		return ip0041Bin;
	}
	

	
	   
	/**
	 * 	Update Ip0041Bin with the passed value
	 *  Corresponding COBOL Variable is IP0041-BIN
	 *	@param number
	 */
	public void setIp0041Bin(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0041Bin = checkIp0041BinMaxLimit(number); 
		serializeIp0041Bin(ip0041Bin);
	}
	

	/**
	 * 	Update Ip0041Bin with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0041Bin(char[] value) throws CFException {
		 ip0041Bin = serializeIp0041Bin(value);
	}
	/**
	 * 	Update Ip0041Bin with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0041BinString(char[] value) throws CFException {
		 setIp0041Bin(value);
	}
	/**
	 *	Returns the value of ip0041Ab
	 *	@return ip0041Ab
	 */
   public char[] getIp0041Ab() throws CFException{
     if (isIp0041AbModified()) { 
        ip0041Ab = refreshIp0041Ab();
     }
   		return ip0041Ab;
   }

  
	/**
	*  set variable ip0041Ab
	*  Corresponding COBOL Variable is IP0041-AB
	*  @param value
	**/
   public void setIp0041Ab(char[] value) {
      ip0041Ab = checkIp0041AbConstraints(value);
      serializeIp0041Ab(ip0041Ab);
   } 

     /**
	 * 	Update Ip0041Ab 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041Ab(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041Ab,ip0041Ab.length);
   	
   }
   
   public void setIp0041Ab(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041Ab,ip0041Ab.length);
   	
   }
   
     /**
	 * 	Update Ip0041Ab 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041Ab(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041Ab+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041Ab with another Field
	 *	@param value
	 */
   public void setIp0041Ab(Field source) {
       replace(source,0,source.length(),beginIp0041Ab,IP_0041_AB_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041Ab 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041Ab(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041Ab,IP_0041_AB_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041Ab 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041Ab(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041Ab+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041Ica
	 *	@return ip0041Ica
	 */
	public long getIp0041Ica() throws CFException {
       if (isIp0041IcaModified()) { 
           ip0041Ica = refreshIp0041Ica();
        }
   		return ip0041Ica;
	}
	

	
	   
	/**
	 * 	Update Ip0041Ica with the passed value
	 *  Corresponding COBOL Variable is IP0041-ICA
	 *	@param number
	 */
	public void setIp0041Ica(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0041Ica = checkIp0041IcaMaxLimit(number); 
		serializeIp0041Ica(ip0041Ica);
	}
	

	/**
	 * 	Update Ip0041Ica with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0041Ica(char[] value) throws CFException {
		 ip0041Ica = serializeIp0041Ica(value);
	}
	/**
	 * 	Update Ip0041Ica with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0041IcaString(char[] value) throws CFException {
		 setIp0041Ica(value);
	}
	/**
	 *	Returns the value of ip0041FormatIndicator
	 *	@return ip0041FormatIndicator
	 */
   public char[] getIp0041FormatIndicator() throws CFException{
     if (isIp0041FormatIndicatorModified()) { 
        ip0041FormatIndicator = refreshIp0041FormatIndicator();
     }
   		return ip0041FormatIndicator;
   }

  
	/**
	*  set variable ip0041FormatIndicator
	*  Corresponding COBOL Variable is IP0041-FORMAT-INDICATOR
	*  @param value
	**/
   public void setIp0041FormatIndicator(char[] value) {
      ip0041FormatIndicator = checkIp0041FormatIndicatorConstraints(value);
      serializeIp0041FormatIndicator(ip0041FormatIndicator);
   } 

     /**
	 * 	Update Ip0041FormatIndicator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041FormatIndicator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041FormatIndicator,ip0041FormatIndicator.length);
   	
   }
   
   public void setIp0041FormatIndicator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041FormatIndicator,ip0041FormatIndicator.length);
   	
   }
   
     /**
	 * 	Update Ip0041FormatIndicator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041FormatIndicator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041FormatIndicator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041FormatIndicator with another Field
	 *	@param value
	 */
   public void setIp0041FormatIndicator(Field source) {
       replace(source,0,source.length(),beginIp0041FormatIndicator,IP_0041_FORMAT_INDICATOR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041FormatIndicator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041FormatIndicator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041FormatIndicator,IP_0041_FORMAT_INDICATOR_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041FormatIndicator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041FormatIndicator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041FormatIndicator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041Endpoint
	 *	@return ip0041Endpoint
	 */
	public long getIp0041Endpoint() throws CFException {
       if (isIp0041EndpointModified()) { 
           ip0041Endpoint = refreshIp0041Endpoint();
        }
   		return ip0041Endpoint;
	}
	

	
	   
	/**
	 * 	Update Ip0041Endpoint with the passed value
	 *  Corresponding COBOL Variable is IP0041-ENDPOINT
	 *	@param number
	 */
	public void setIp0041Endpoint(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip0041Endpoint = checkIp0041EndpointMaxLimit(number); 
		serializeIp0041Endpoint(ip0041Endpoint);
	}
	

	/**
	 * 	Update Ip0041Endpoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp0041Endpoint(char[] value) throws CFException {
		 ip0041Endpoint = serializeIp0041Endpoint(value);
	}
	/**
	 * 	Update Ip0041Endpoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp0041EndpointString(char[] value) throws CFException {
		 setIp0041Endpoint(value);
	}
	/**
	 *	Returns the value of ip0041PosMvInd
	 *	@return ip0041PosMvInd
	 */
   public char[] getIp0041PosMvInd() throws CFException{
     if (isIp0041PosMvIndModified()) { 
        ip0041PosMvInd = refreshIp0041PosMvInd();
     }
   		return ip0041PosMvInd;
   }

  
	/**
	*  set variable ip0041PosMvInd
	*  Corresponding COBOL Variable is IP0041-POS-MV-IND
	*  @param value
	**/
   public void setIp0041PosMvInd(char[] value) {
      ip0041PosMvInd = checkIp0041PosMvIndConstraints(value);
      serializeIp0041PosMvInd(ip0041PosMvInd);
   } 

     /**
	 * 	Update Ip0041PosMvInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041PosMvInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041PosMvInd,ip0041PosMvInd.length);
   	
   }
   
   public void setIp0041PosMvInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041PosMvInd,ip0041PosMvInd.length);
   	
   }
   
     /**
	 * 	Update Ip0041PosMvInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041PosMvInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041PosMvInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041PosMvInd with another Field
	 *	@param value
	 */
   public void setIp0041PosMvInd(Field source) {
       replace(source,0,source.length(),beginIp0041PosMvInd,IP_0041_POS_MV_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041PosMvInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041PosMvInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041PosMvInd,IP_0041_POS_MV_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041PosMvInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041PosMvInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041PosMvInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041AtmMvInd
	 *	@return ip0041AtmMvInd
	 */
   public char[] getIp0041AtmMvInd() throws CFException{
     if (isIp0041AtmMvIndModified()) { 
        ip0041AtmMvInd = refreshIp0041AtmMvInd();
     }
   		return ip0041AtmMvInd;
   }

  
	/**
	*  set variable ip0041AtmMvInd
	*  Corresponding COBOL Variable is IP0041-ATM-MV-IND
	*  @param value
	**/
   public void setIp0041AtmMvInd(char[] value) {
      ip0041AtmMvInd = checkIp0041AtmMvIndConstraints(value);
      serializeIp0041AtmMvInd(ip0041AtmMvInd);
   } 

     /**
	 * 	Update Ip0041AtmMvInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041AtmMvInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041AtmMvInd,ip0041AtmMvInd.length);
   	
   }
   
   public void setIp0041AtmMvInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041AtmMvInd,ip0041AtmMvInd.length);
   	
   }
   
     /**
	 * 	Update Ip0041AtmMvInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041AtmMvInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041AtmMvInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041AtmMvInd with another Field
	 *	@param value
	 */
   public void setIp0041AtmMvInd(Field source) {
       replace(source,0,source.length(),beginIp0041AtmMvInd,IP_0041_ATM_MV_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041AtmMvInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041AtmMvInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041AtmMvInd,IP_0041_ATM_MV_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041AtmMvInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041AtmMvInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041AtmMvInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041UcafInd
	 *	@return ip0041UcafInd
	 */
   public char[] getIp0041UcafInd() throws CFException{
     if (isIp0041UcafIndModified()) { 
        ip0041UcafInd = refreshIp0041UcafInd();
     }
   		return ip0041UcafInd;
   }

  
	/**
	*  set variable ip0041UcafInd
	*  Corresponding COBOL Variable is IP0041-UCAF-IND
	*  @param value
	**/
   public void setIp0041UcafInd(char[] value) {
      ip0041UcafInd = checkIp0041UcafIndConstraints(value);
      serializeIp0041UcafInd(ip0041UcafInd);
   } 

     /**
	 * 	Update Ip0041UcafInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041UcafInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041UcafInd,ip0041UcafInd.length);
   	
   }
   
   public void setIp0041UcafInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041UcafInd,ip0041UcafInd.length);
   	
   }
   
     /**
	 * 	Update Ip0041UcafInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041UcafInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041UcafInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041UcafInd with another Field
	 *	@param value
	 */
   public void setIp0041UcafInd(Field source) {
       replace(source,0,source.length(),beginIp0041UcafInd,IP_0041_UCAF_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041UcafInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041UcafInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041UcafInd,IP_0041_UCAF_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041UcafInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041UcafInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041UcafInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041RegionTable
	 *	@return ip0041RegionTable
	 */   
	 public Ip0041RegionTable getIp0041RegionTable() {
   	return ip0041RegionTable;
   }
   /**
	* 	Update Ip0041RegionTable with the passed value
	*   Corresponding COBOL Variable is IP0041-REGION-TABLE
	*	@param value
	*/
   public void setIp0041RegionTable(char[] value) {
      ip0041RegionTable.setString(value); 
   }   
    
     /**
	 * 	Update Ip0041RegionTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0041RegionTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041RegionTable.begin,ip0041RegionTable.length());
   }
   
     /**
	 * 	Update Ip0041RegionTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041RegionTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041RegionTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0041RegionTable with another Field
	 *	@param value
	 */
   public void setIp0041RegionTable(Field source) {
   	replace(source,0,source.length(),ip0041RegionTable.begin,ip0041RegionTable.length());
   }  
   
     /**
	 * 	Update Ip0041RegionTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0041RegionTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041RegionTable.begin,ip0041RegionTable.length());
   }
   
     /**
	 * 	Update Ip0041RegionTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041RegionTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041RegionTable.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0041CountryTable
	 *	@return ip0041CountryTable
	 */   
	 public Ip0041CountryTable getIp0041CountryTable() {
   	return ip0041CountryTable;
   }
   /**
	* 	Update Ip0041CountryTable with the passed value
	*   Corresponding COBOL Variable is IP0041-COUNTRY-TABLE
	*	@param value
	*/
   public void setIp0041CountryTable(char[] value) {
      ip0041CountryTable.setString(value); 
   }   
    
     /**
	 * 	Update Ip0041CountryTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0041CountryTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041CountryTable.begin,ip0041CountryTable.length());
   }
   
     /**
	 * 	Update Ip0041CountryTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041CountryTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041CountryTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0041CountryTable with another Field
	 *	@param value
	 */
   public void setIp0041CountryTable(Field source) {
   	replace(source,0,source.length(),ip0041CountryTable.begin,ip0041CountryTable.length());
   }  
   
     /**
	 * 	Update Ip0041CountryTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0041CountryTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041CountryTable.begin,ip0041CountryTable.length());
   }
   
     /**
	 * 	Update Ip0041CountryTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041CountryTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041CountryTable.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip0041RePowerInd
	 *	@return ip0041RePowerInd
	 */
   public char[] getIp0041RePowerInd() throws CFException{
     if (isIp0041RePowerIndModified()) { 
        ip0041RePowerInd = refreshIp0041RePowerInd();
     }
   		return ip0041RePowerInd;
   }

  
	/**
	*  set variable ip0041RePowerInd
	*  Corresponding COBOL Variable is IP0041-RE-POWER-IND
	*  @param value
	**/
   public void setIp0041RePowerInd(char[] value) {
      ip0041RePowerInd = checkIp0041RePowerIndConstraints(value);
      serializeIp0041RePowerInd(ip0041RePowerInd);
   } 

     /**
	 * 	Update Ip0041RePowerInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041RePowerInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041RePowerInd,ip0041RePowerInd.length);
   	
   }
   
   public void setIp0041RePowerInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041RePowerInd,ip0041RePowerInd.length);
   	
   }
   
     /**
	 * 	Update Ip0041RePowerInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041RePowerInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041RePowerInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041RePowerInd with another Field
	 *	@param value
	 */
   public void setIp0041RePowerInd(Field source) {
       replace(source,0,source.length(),beginIp0041RePowerInd,IP_0041_RE_POWER_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041RePowerInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041RePowerInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041RePowerInd,IP_0041_RE_POWER_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041RePowerInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041RePowerInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041RePowerInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041DomDbtParticipSw
	 *	@return ip0041DomDbtParticipSw
	 */
   public char[] getIp0041DomDbtParticipSw() throws CFException{
     if (isIp0041DomDbtParticipSwModified()) { 
        ip0041DomDbtParticipSw = refreshIp0041DomDbtParticipSw();
     }
   		return ip0041DomDbtParticipSw;
   }

  
	/**
	*  set variable ip0041DomDbtParticipSw
	*  Corresponding COBOL Variable is IP0041-DOM-DBT-PARTICIP-SW
	*  @param value
	**/
   public void setIp0041DomDbtParticipSw(char[] value) {
      ip0041DomDbtParticipSw = checkIp0041DomDbtParticipSwConstraints(value);
      serializeIp0041DomDbtParticipSw(ip0041DomDbtParticipSw);
   } 

     /**
	 * 	Update Ip0041DomDbtParticipSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041DomDbtParticipSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041DomDbtParticipSw,ip0041DomDbtParticipSw.length);
   	
   }
   
   public void setIp0041DomDbtParticipSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041DomDbtParticipSw,ip0041DomDbtParticipSw.length);
   	
   }
   
     /**
	 * 	Update Ip0041DomDbtParticipSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041DomDbtParticipSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041DomDbtParticipSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041DomDbtParticipSw with another Field
	 *	@param value
	 */
   public void setIp0041DomDbtParticipSw(Field source) {
       replace(source,0,source.length(),beginIp0041DomDbtParticipSw,IP_0041_DOM_DBT_PARTICIP_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041DomDbtParticipSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041DomDbtParticipSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041DomDbtParticipSw,IP_0041_DOM_DBT_PARTICIP_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041DomDbtParticipSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041DomDbtParticipSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041DomDbtParticipSw+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041IchgAcqCd
	 *	@return ip0041IchgAcqCd
	 */
   public char[] getIp0041IchgAcqCd() throws CFException{
     if (isIp0041IchgAcqCdModified()) { 
        ip0041IchgAcqCd = refreshIp0041IchgAcqCd();
     }
   		return ip0041IchgAcqCd;
   }

  
	/**
	*  set variable ip0041IchgAcqCd
	*  Corresponding COBOL Variable is IP0041-ICHG-ACQ-CD
	*  @param value
	**/
   public void setIp0041IchgAcqCd(char[] value) {
      ip0041IchgAcqCd = checkIp0041IchgAcqCdConstraints(value);
      serializeIp0041IchgAcqCd(ip0041IchgAcqCd);
   } 

     /**
	 * 	Update Ip0041IchgAcqCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041IchgAcqCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041IchgAcqCd,ip0041IchgAcqCd.length);
   	
   }
   
   public void setIp0041IchgAcqCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041IchgAcqCd,ip0041IchgAcqCd.length);
   	
   }
   
     /**
	 * 	Update Ip0041IchgAcqCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041IchgAcqCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041IchgAcqCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041IchgAcqCd with another Field
	 *	@param value
	 */
   public void setIp0041IchgAcqCd(Field source) {
       replace(source,0,source.length(),beginIp0041IchgAcqCd,IP_0041_ICHG_ACQ_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041IchgAcqCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041IchgAcqCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041IchgAcqCd,IP_0041_ICHG_ACQ_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041IchgAcqCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041IchgAcqCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041IchgAcqCd+targetIndex,targetLen);
    
   }
	char[] ip004188Presentment88Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isIp004188Presentment()
	 *	@return  Returns true if isIp004188Presentment() is "P"
	 */
   public boolean isIp004188Presentment() throws CFException {
      return (  compareChars( getIp0041IchgAcqCd() , ip004188Presentment88Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setIp004188PresentmentTrue() {  			
    	setIp0041IchgAcqCd( ip004188Presentment88Value);
   	}
	char[] ip004188PrsnmntNChgbk88Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isIp004188PrsnmntNChgbk()
	 *	@return  Returns true if isIp004188PrsnmntNChgbk() is "B"
	 */
   public boolean isIp004188PrsnmntNChgbk() throws CFException {
      return (  compareChars( getIp0041IchgAcqCd() , ip004188PrsnmntNChgbk88Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setIp004188PrsnmntNChgbkTrue() {  			
    	setIp0041IchgAcqCd( ip004188PrsnmntNChgbk88Value);
   	}
	char[] ip004188NotParticipate88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp004188NotParticipate()
	 *	@return  Returns true if isIp004188NotParticipate() is "N"
	 */
   public boolean isIp004188NotParticipate() throws CFException {
      return (  compareChars( getIp0041IchgAcqCd() , ip004188NotParticipate88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp004188NotParticipateTrue() {  			
    	setIp0041IchgAcqCd( ip004188NotParticipate88Value);
   	}
	/**
	 *	Returns the value of ip0041MemberFiller
	 *	@return ip0041MemberFiller
	 */
   public char[] getIp0041MemberFiller() throws CFException{
     if (isIp0041MemberFillerModified()) { 
        ip0041MemberFiller = refreshIp0041MemberFiller();
     }
   		return ip0041MemberFiller;
   }

  
	/**
	*  set variable ip0041MemberFiller
	*  Corresponding COBOL Variable is IP0041-MEMBER-FILLER
	*  @param value
	**/
   public void setIp0041MemberFiller(char[] value) {
      ip0041MemberFiller = checkIp0041MemberFillerConstraints(value);
      serializeIp0041MemberFiller(ip0041MemberFiller);
   } 

     /**
	 * 	Update Ip0041MemberFiller 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp0041MemberFiller(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp0041MemberFiller,ip0041MemberFiller.length);
   	
   }
   
   public void setIp0041MemberFiller(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041MemberFiller,ip0041MemberFiller.length);
   	
   }
   
     /**
	 * 	Update Ip0041MemberFiller 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041MemberFiller(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041MemberFiller+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip0041MemberFiller with another Field
	 *	@param value
	 */
   public void setIp0041MemberFiller(Field source) {
       replace(source,0,source.length(),beginIp0041MemberFiller,IP_0041_MEMBER_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip0041MemberFiller 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp0041MemberFiller(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp0041MemberFiller,IP_0041_MEMBER_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip0041MemberFiller 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041MemberFiller(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp0041MemberFiller+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip0041CentralSiteFields
	 *	@return ip0041CentralSiteFields
	 */   
	 public Ip0041CentralSiteFields getIp0041CentralSiteFields() {
   	return ip0041CentralSiteFields;
   }
   /**
	* 	Update Ip0041CentralSiteFields with the passed value
	*   Corresponding COBOL Variable is IP0041-CENTRAL-SITE-FIELDS
	*	@param value
	*/
   public void setIp0041CentralSiteFields(char[] value) {
      ip0041CentralSiteFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip0041CentralSiteFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0041CentralSiteFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041CentralSiteFields.begin,ip0041CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip0041CentralSiteFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041CentralSiteFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041CentralSiteFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0041CentralSiteFields with another Field
	 *	@param value
	 */
   public void setIp0041CentralSiteFields(Field source) {
   	replace(source,0,source.length(),ip0041CentralSiteFields.begin,ip0041CentralSiteFields.length());
   }  
   
     /**
	 * 	Update Ip0041CentralSiteFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0041CentralSiteFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041CentralSiteFields.begin,ip0041CentralSiteFields.length());
   }
   
     /**
	 * 	Update Ip0041CentralSiteFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041CentralSiteFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041CentralSiteFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip0041TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp0041Bin(0);
         setIp0041Ab(CONSTANTS.SPACE_3);
                     setIp0041Ica(0);
         setIp0041FormatIndicator(CONSTANTS.SPACE);
                     setIp0041Endpoint(0);
         setIp0041PosMvInd(CONSTANTS.SPACE);
         setIp0041AtmMvInd(CONSTANTS.SPACE);
         setIp0041UcafInd(CONSTANTS.SPACE);
          ip0041RegionTable.initialize();
     
          ip0041CountryTable.initialize();
     
         setIp0041RePowerInd(CONSTANTS.SPACE);
         setIp0041DomDbtParticipSw(CONSTANTS.SPACE);
         setIp0041IchgAcqCd(CONSTANTS.SPACE);
         setIp0041MemberFiller(CONSTANTS.SPACE_5);
          ip0041CentralSiteFields.initialize();
     
   }

		public static int getIp0041TableDataFieldLength() {
			return IP_0041_TABLE_DATA_LENGTH;
		}

}
  
