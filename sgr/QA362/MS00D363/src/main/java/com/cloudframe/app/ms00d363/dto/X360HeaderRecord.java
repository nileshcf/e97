package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360HeaderRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class X360HeaderRecord extends X360HeaderRecordSerialized { 
   

						private char[] x360HeaderId = Field.fillLowValue(8);


						private char[] x360HeaderPgm = Field.fillLowValue(8);

				private X360HeaderDate x360HeaderDate = new X360HeaderDate();


						private char[] x360HeaderFileId = Field.fillLowValue(3);

								private long x360HeaderEndpoint;

								private long x360HeaderEntIca;

								private long x360HeaderMbrIca;

								private int x360HeaderCuttime;
				private X360HeaderSscIdGrp x360HeaderSscIdGrp = new X360HeaderSscIdGrp();

	
	/**
	* Constructor for X360HeaderRecord
	**/
    public X360HeaderRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for X360HeaderRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360HeaderRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			x360HeaderDate.setParent(this,getStartOffset() + 22);
	       			x360HeaderSscIdGrp.setParent(this,getStartOffset() + 55);
    } 

	/**
	 *	Returns the value of x360HeaderId
	 *	@return x360HeaderId
	 */
   public char[] getX360HeaderId() throws CFException{
     if (isX360HeaderIdModified()) { 
        x360HeaderId = refreshX360HeaderId();
     }
   		return x360HeaderId;
   }

  
	/**
	*  set variable x360HeaderId
	*  Corresponding COBOL Variable is X360-HEADER-ID
	*  @param value
	**/
   public void setX360HeaderId(char[] value) {
      x360HeaderId = checkX360HeaderIdConstraints(value);
      serializeX360HeaderId(x360HeaderId);
   } 

     /**
	 * 	Update X360HeaderId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderId,x360HeaderId.length);
   	
   }
   
   public void setX360HeaderId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderId,x360HeaderId.length);
   	
   }
   
     /**
	 * 	Update X360HeaderId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderId with another Field
	 *	@param value
	 */
   public void setX360HeaderId(Field source) {
       replace(source,0,source.length(),beginX360HeaderId,X_360_HEADER_ID_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderId,X_360_HEADER_ID_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderId+targetIndex,targetLen);
    
   }
	char[] x360HeaderIdExtract88Value = "EXTRACT ".toCharArray();
	/**
	 *	Test condition "EXTRACT " for isX360HeaderIdExtract()
	 *	@return  Returns true if isX360HeaderIdExtract() is "EXTRACT "
	 */
   public boolean isX360HeaderIdExtract() throws CFException {
      return (  compareChars( getX360HeaderId() , x360HeaderIdExtract88Value)  == 0  );
   }


	/**
	*  set values "EXTRACT "
	*/
   	public void setX360HeaderIdExtractTrue() {  			
    	setX360HeaderId( x360HeaderIdExtract88Value);
   	}
	/**
	 *	Returns the value of x360HeaderPgm
	 *	@return x360HeaderPgm
	 */
   public char[] getX360HeaderPgm() throws CFException{
     if (isX360HeaderPgmModified()) { 
        x360HeaderPgm = refreshX360HeaderPgm();
     }
   		return x360HeaderPgm;
   }

  
	/**
	*  set variable x360HeaderPgm
	*  Corresponding COBOL Variable is X360-HEADER-PGM
	*  @param value
	**/
   public void setX360HeaderPgm(char[] value) {
      x360HeaderPgm = checkX360HeaderPgmConstraints(value);
      serializeX360HeaderPgm(x360HeaderPgm);
   } 

     /**
	 * 	Update X360HeaderPgm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderPgm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderPgm,x360HeaderPgm.length);
   	
   }
   
   public void setX360HeaderPgm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderPgm,x360HeaderPgm.length);
   	
   }
   
     /**
	 * 	Update X360HeaderPgm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderPgm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderPgm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderPgm with another Field
	 *	@param value
	 */
   public void setX360HeaderPgm(Field source) {
       replace(source,0,source.length(),beginX360HeaderPgm,X_360_HEADER_PGM_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderPgm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderPgm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderPgm,X_360_HEADER_PGM_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderPgm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderPgm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderPgm+targetIndex,targetLen);
    
   }
	char[] x360HeaderPgmMs00d36088Value = "MS00D360".toCharArray();
	/**
	 *	Test condition "MS00D360" for isX360HeaderPgmMs00d360()
	 *	@return  Returns true if isX360HeaderPgmMs00d360() is "MS00D360"
	 */
   public boolean isX360HeaderPgmMs00d360() throws CFException {
      return (  compareChars( getX360HeaderPgm() , x360HeaderPgmMs00d36088Value)  == 0  );
   }


	/**
	*  set values "MS00D360"
	*/
   	public void setX360HeaderPgmMs00d360True() {  			
    	setX360HeaderPgm( x360HeaderPgmMs00d36088Value);
   	}
	/**
	 *	Returns the value of x360HeaderDate
	 *	@return x360HeaderDate
	 */   
	 public X360HeaderDate getX360HeaderDate() {
   	return x360HeaderDate;
   }
   /**
	* 	Update X360HeaderDate with the passed value
	*   Corresponding COBOL Variable is X360-HEADER-DATE
	*	@param value
	*/
   public void setX360HeaderDate(char[] value) {
      x360HeaderDate.setString(value); 
   }   
    
     /**
	 * 	Update X360HeaderDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderDate.begin,x360HeaderDate.length());
   }
   
     /**
	 * 	Update X360HeaderDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360HeaderDate with another Field
	 *	@param value
	 */
   public void setX360HeaderDate(Field source) {
   	replace(source,0,source.length(),x360HeaderDate.begin,x360HeaderDate.length());
   }  
   
     /**
	 * 	Update X360HeaderDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderDate.begin,x360HeaderDate.length());
   }
   
     /**
	 * 	Update X360HeaderDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderDate.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of x360HeaderFileId
	 *	@return x360HeaderFileId
	 */
   public char[] getX360HeaderFileId() throws CFException{
     if (isX360HeaderFileIdModified()) { 
        x360HeaderFileId = refreshX360HeaderFileId();
     }
   		return x360HeaderFileId;
   }

  
	/**
	*  set variable x360HeaderFileId
	*  Corresponding COBOL Variable is X360-HEADER-FILE-ID
	*  @param value
	**/
   public void setX360HeaderFileId(char[] value) {
      x360HeaderFileId = checkX360HeaderFileIdConstraints(value);
      serializeX360HeaderFileId(x360HeaderFileId);
   } 

     /**
	 * 	Update X360HeaderFileId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderFileId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginX360HeaderFileId,x360HeaderFileId.length);
   	
   }
   
   public void setX360HeaderFileId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderFileId,x360HeaderFileId.length);
   	
   }
   
     /**
	 * 	Update X360HeaderFileId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderFileId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderFileId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update X360HeaderFileId with another Field
	 *	@param value
	 */
   public void setX360HeaderFileId(Field source) {
       replace(source,0,source.length(),beginX360HeaderFileId,X_360_HEADER_FILE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update X360HeaderFileId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setX360HeaderFileId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginX360HeaderFileId,X_360_HEADER_FILE_ID_LEN);
   	
   }
   
     /**
	 * 	Update X360HeaderFileId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderFileId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginX360HeaderFileId+targetIndex,targetLen);
    
   }
	char[] x360HeaderFileAcquir88Value = "ACQ".toCharArray();
	/**
	 *	Test condition "ACQ" for isX360HeaderFileAcquir()
	 *	@return  Returns true if isX360HeaderFileAcquir() is "ACQ"
	 */
   public boolean isX360HeaderFileAcquir() throws CFException {
      return (  compareChars( getX360HeaderFileId() , x360HeaderFileAcquir88Value)  == 0  );
   }


	/**
	*  set values "ACQ"
	*/
   	public void setX360HeaderFileAcquirTrue() {  			
    	setX360HeaderFileId( x360HeaderFileAcquir88Value);
   	}
	char[] x360HeaderFileIssuer88Value = "ISS".toCharArray();
	/**
	 *	Test condition "ISS" for isX360HeaderFileIssuer()
	 *	@return  Returns true if isX360HeaderFileIssuer() is "ISS"
	 */
   public boolean isX360HeaderFileIssuer() throws CFException {
      return (  compareChars( getX360HeaderFileId() , x360HeaderFileIssuer88Value)  == 0  );
   }


	/**
	*  set values "ISS"
	*/
   	public void setX360HeaderFileIssuerTrue() {  			
    	setX360HeaderFileId( x360HeaderFileIssuer88Value);
   	}
	/**
	 *	Returns the value of x360HeaderEndpoint
	 *	@return x360HeaderEndpoint
	 */
	public long getX360HeaderEndpoint() throws CFException {
       if (isX360HeaderEndpointModified()) { 
           x360HeaderEndpoint = refreshX360HeaderEndpoint();
        }
   		return x360HeaderEndpoint;
	}
	

	
	   
	/**
	 * 	Update X360HeaderEndpoint with the passed value
	 *  Corresponding COBOL Variable is X360-HEADER-ENDPOINT
	 *	@param number
	 */
	public void setX360HeaderEndpoint(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360HeaderEndpoint = checkX360HeaderEndpointMaxLimit(number); 
		serializeX360HeaderEndpoint(x360HeaderEndpoint);
	}
	

	/**
	 * 	Update X360HeaderEndpoint with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360HeaderEndpoint(char[] value) throws CFException {
		 x360HeaderEndpoint = serializeX360HeaderEndpoint(value);
	}
	/**
	 * 	Update X360HeaderEndpoint with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360HeaderEndpointString(char[] value) throws CFException {
		 setX360HeaderEndpoint(value);
	}
	/**
	 *	Returns the value of x360HeaderEntIca
	 *	@return x360HeaderEntIca
	 */
	public long getX360HeaderEntIca() throws CFException {
       if (isX360HeaderEntIcaModified()) { 
           x360HeaderEntIca = refreshX360HeaderEntIca();
        }
   		return x360HeaderEntIca;
	}
	

	
	   
	/**
	 * 	Update X360HeaderEntIca with the passed value
	 *  Corresponding COBOL Variable is X360-HEADER-ENT-ICA
	 *	@param number
	 */
	public void setX360HeaderEntIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360HeaderEntIca = checkX360HeaderEntIcaMaxLimit(number); 
		serializeX360HeaderEntIca(x360HeaderEntIca);
	}
	

	/**
	 * 	Update X360HeaderEntIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360HeaderEntIca(char[] value) throws CFException {
		 x360HeaderEntIca = serializeX360HeaderEntIca(value);
	}
	/**
	 * 	Update X360HeaderEntIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360HeaderEntIcaString(char[] value) throws CFException {
		 setX360HeaderEntIca(value);
	}
	/**
	 *	Returns the value of x360HeaderMbrIca
	 *	@return x360HeaderMbrIca
	 */
	public long getX360HeaderMbrIca() throws CFException {
       if (isX360HeaderMbrIcaModified()) { 
           x360HeaderMbrIca = refreshX360HeaderMbrIca();
        }
   		return x360HeaderMbrIca;
	}
	

	
	   
	/**
	 * 	Update X360HeaderMbrIca with the passed value
	 *  Corresponding COBOL Variable is X360-HEADER-MBR-ICA
	 *	@param number
	 */
	public void setX360HeaderMbrIca(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360HeaderMbrIca = checkX360HeaderMbrIcaMaxLimit(number); 
		serializeX360HeaderMbrIca(x360HeaderMbrIca);
	}
	

	/**
	 * 	Update X360HeaderMbrIca with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360HeaderMbrIca(char[] value) throws CFException {
		 x360HeaderMbrIca = serializeX360HeaderMbrIca(value);
	}
	/**
	 * 	Update X360HeaderMbrIca with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360HeaderMbrIcaString(char[] value) throws CFException {
		 setX360HeaderMbrIca(value);
	}
	/**
	 *	Returns the value of x360HeaderCuttime
	 *	@return x360HeaderCuttime
	 */
	public int getX360HeaderCuttime() throws CFException {
       if (isX360HeaderCuttimeModified()) { 
           x360HeaderCuttime = refreshX360HeaderCuttime();
        }
   		return x360HeaderCuttime;
	}
	

	
	   
	/**
	 * 	Update X360HeaderCuttime with the passed value
	 *  Corresponding COBOL Variable is X360-HEADER-CUTTIME
	 *	@param number
	 */
	public void setX360HeaderCuttime(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    x360HeaderCuttime = checkX360HeaderCuttimeMaxLimit(number); 
		serializeX360HeaderCuttime(x360HeaderCuttime);
	}
	

	public void setX360HeaderCuttime(long number) {
	    number = checkX360HeaderCuttimeMaxLimit(number); // Truncate if value is beyond +/- Max range
		setX360HeaderCuttime((int)number);
	}
	
	/**
	 * 	Update X360HeaderCuttime with the passed value
	 *	@param value (String or char[])
	 */
	public void setX360HeaderCuttime(char[] value) throws CFException {
		 x360HeaderCuttime = serializeX360HeaderCuttime(value);
	}
	/**
	 * 	Update X360HeaderCuttime with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setX360HeaderCuttimeString(char[] value) throws CFException {
		 setX360HeaderCuttime(value);
	}
	/**
	 *	Returns the value of x360HeaderSscIdGrp
	 *	@return x360HeaderSscIdGrp
	 */   
	 public X360HeaderSscIdGrp getX360HeaderSscIdGrp() {
   	return x360HeaderSscIdGrp;
   }
   /**
	* 	Update X360HeaderSscIdGrp with the passed value
	*   Corresponding COBOL Variable is X360-HEADER-SSC-ID-GRP
	*	@param value
	*/
   public void setX360HeaderSscIdGrp(char[] value) {
      x360HeaderSscIdGrp.setString(value); 
   }   
    
     /**
	 * 	Update X360HeaderSscIdGrp 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscIdGrp(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderSscIdGrp.begin,x360HeaderSscIdGrp.length());
   }
   
     /**
	 * 	Update X360HeaderSscIdGrp 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscIdGrp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderSscIdGrp.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update X360HeaderSscIdGrp with another Field
	 *	@param value
	 */
   public void setX360HeaderSscIdGrp(Field source) {
   	replace(source,0,source.length(),x360HeaderSscIdGrp.begin,x360HeaderSscIdGrp.length());
   }  
   
     /**
	 * 	Update X360HeaderSscIdGrp 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setX360HeaderSscIdGrp(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderSscIdGrp.begin,x360HeaderSscIdGrp.length());
   }
   
     /**
	 * 	Update X360HeaderSscIdGrp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setX360HeaderSscIdGrp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,x360HeaderSscIdGrp.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes X360HeaderRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setX360HeaderId(CONSTANTS.SPACE_8);
         setX360HeaderPgm(CONSTANTS.SPACE_8);
          x360HeaderDate.initialize();
     
         setX360HeaderFileId(CONSTANTS.SPACE_3);
                     setX360HeaderEndpoint(0);
                     setX360HeaderEntIca(0);
                     setX360HeaderMbrIca(0);
                     setX360HeaderCuttime(0);
          x360HeaderSscIdGrp.initialize();
     
   }

		public static int getX360HeaderRecordFieldLength() {
			return X_360_HEADER_RECORD_LENGTH;
		}

}
  
