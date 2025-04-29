package com.cloudframe.app.ar640010.dto;

/**
*  The class Ar649Parameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ar649Parameters extends Ar649ParametersSerialized {
   

						private char[] ar649ProgramId = new char[8];
				private Ar649UserParms ar649UserParms = new Ar649UserParms();

								private short ar649ReturnCode;

								private short ar649ActionCode;

						private char[] ar649XferMthdCd = new char[1];

						private char[] ar649CommitActionCd = new char[1];
	
	/**
	* Constructor for Ar649Parameters
	**/
    public Ar649Parameters() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ar649UserParms.setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
								setAr649ProgramId(("AR649010").toCharArray());
								setAr649ReturnCode((short)0);
								setAr649ActionCode((short)0);
								setAr649XferMthdCd(fillSpace(1));
								setAr649CommitActionCd(("Y").toCharArray());
    }


 

	/**
	 *	Returns the value of ar649ProgramId
	 *	@return ar649ProgramId
	 */
   public char[] getAr649ProgramId() throws CFException{
     if (isAr649ProgramIdModified()) { 
        ar649ProgramId = refreshAr649ProgramId();
     }
   		return ar649ProgramId;
   }

  
	/**
	*  set variable ar649ProgramId
	*  Corresponding COBOL Variable is AR649-PROGRAM-ID
	*  @param value
	**/
   public void setAr649ProgramId(char[] value) {
      ar649ProgramId = checkAr649ProgramIdConstraints(value);
      serializeAr649ProgramId(ar649ProgramId);
   } 

     /**
	 * 	Update Ar649ProgramId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr649ProgramId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr649ProgramId,ar649ProgramId.length);
   	
   }
   
   public void setAr649ProgramId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr649ProgramId,ar649ProgramId.length);
   	
   }
   
     /**
	 * 	Update Ar649ProgramId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr649ProgramId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649ProgramId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar649ProgramId with another Field
	 *	@param value
	 */
   public void setAr649ProgramId(Field source) {
       replace(source,0,source.length(),beginAr649ProgramId,AR_649_PROGRAM_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ar649ProgramId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr649ProgramId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr649ProgramId,AR_649_PROGRAM_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ar649ProgramId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr649ProgramId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649ProgramId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar649UserParms
	 *	@return ar649UserParms
	 */   
	 public Ar649UserParms getAr649UserParms() {
   	return ar649UserParms;
   }
   /**
	* 	Update Ar649UserParms with the passed value
	*   Corresponding COBOL Variable is AR649-USER-PARMS
	*	@param value
	*/
   public void setAr649UserParms(char[] value) {
      ar649UserParms.setString(value); 
   }   
    
     /**
	 * 	Update Ar649UserParms 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setAr649UserParms(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar649UserParms.begin,ar649UserParms.length());
   }
   
     /**
	 * 	Update Ar649UserParms 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr649UserParms(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar649UserParms.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ar649UserParms with another Field
	 *	@param value
	 */
   public void setAr649UserParms(Field source) {
   	replace(source,0,source.length(),ar649UserParms.begin,ar649UserParms.length());
   }  
   
     /**
	 * 	Update Ar649UserParms 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setAr649UserParms(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ar649UserParms.begin,ar649UserParms.length());
   }
   
     /**
	 * 	Update Ar649UserParms 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr649UserParms(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ar649UserParms.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ar649ReturnCode
	 *	@return ar649ReturnCode
	 */
	public short getAr649ReturnCode() throws CFException {
        if (isAr649ReturnCodeModified()) { 
           ar649ReturnCode = refreshAr649ReturnCode();
        }
   		return ar649ReturnCode;
	}
	
	/**
	 * 	Update Ar649ReturnCode with the passed value
	 *  Corresponding COBOL Variable is AR649-RETURN-CODE
	 *	@param number
	 */
	public void setAr649ReturnCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ar649ReturnCode = checkAr649ReturnCodeMaxLimit(number); 
		serializeAr649ReturnCode(ar649ReturnCode);
	}

	public void setAr649ReturnCode(int number) {
	    number = checkAr649ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr649ReturnCode((short)number);
	}
	public void setAr649ReturnCode(long number) {
	    number = checkAr649ReturnCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr649ReturnCode((short)number);
	}
	

	
	/**
	 *	Test condition 0 for isAr649ReturnValid88()
	 *	@return  Returns true if isAr649ReturnValid88() is 0
	 */
   public boolean isAr649ReturnValid88() throws CFException {
      return (  getAr649ReturnCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setAr649ReturnValid88True() {  			
    	setAr649ReturnCode( (short)0);
   	}
	
	/**
	 *	Test condition 4 for isAr649ReturnError88()
	 *	@return  Returns true if isAr649ReturnError88() is 4
	 */
   public boolean isAr649ReturnError88() throws CFException {
      return (  getAr649ReturnCode()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setAr649ReturnError88True() {  			
    	setAr649ReturnCode( (short)4);
   	}
	/**
	 *	Returns the value of ar649ActionCode
	 *	@return ar649ActionCode
	 */
	public short getAr649ActionCode() throws CFException {
        if (isAr649ActionCodeModified()) { 
           ar649ActionCode = refreshAr649ActionCode();
        }
   		return ar649ActionCode;
	}
	
	/**
	 * 	Update Ar649ActionCode with the passed value
	 *  Corresponding COBOL Variable is AR649-ACTION-CODE
	 *	@param number
	 */
	public void setAr649ActionCode(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ar649ActionCode = checkAr649ActionCodeMaxLimit(number); 
		serializeAr649ActionCode(ar649ActionCode);
	}

	public void setAr649ActionCode(int number) {
	    number = checkAr649ActionCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr649ActionCode((short)number);
	}
	public void setAr649ActionCode(long number) {
	    number = checkAr649ActionCodeMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setAr649ActionCode((short)number);
	}
	

	
	/**
	 *	Test condition 0 THRU 9 for isAr649ActionSuccessful88()
	 *	@return  Returns true if isAr649ActionSuccessful88() is 0 THRU 9
	 */
   public boolean isAr649ActionSuccessful88() throws CFException {
      return (   (getAr649ActionCode()  >=  0 ) &&   (getAr649ActionCode()  <=  9 )   );
   }


	/**
	*  set values 0 THRU 9
	*/
   	public void setAr649ActionSuccessful88True() {  			
    	setAr649ActionCode( (short)0);
   	}
	
	/**
	 *	Test condition 0 for isAr649ProfileRowFound88()
	 *	@return  Returns true if isAr649ProfileRowFound88() is 0
	 */
   public boolean isAr649ProfileRowFound88() throws CFException {
      return (  getAr649ActionCode()  ==  0  );
   }


	/**
	*  set values 0
	*/
   	public void setAr649ProfileRowFound88True() {  			
    	setAr649ActionCode( (short)0);
   	}
	
	/**
	 *	Test condition 1 for isAr649ProfileRowBuilt88()
	 *	@return  Returns true if isAr649ProfileRowBuilt88() is 1
	 */
   public boolean isAr649ProfileRowBuilt88() throws CFException {
      return (  getAr649ActionCode()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setAr649ProfileRowBuilt88True() {  			
    	setAr649ActionCode( (short)1);
   	}
	
	/**
	 *	Test condition 10 THRU 100 for isAr649ActionError88()
	 *	@return  Returns true if isAr649ActionError88() is 10 THRU 100
	 */
   public boolean isAr649ActionError88() throws CFException {
      return (   (getAr649ActionCode()  >=  10 ) &&   (getAr649ActionCode()  <=  100 )   );
   }


	/**
	*  set values 10 THRU 100
	*/
   	public void setAr649ActionError88True() {  			
    	setAr649ActionCode( (short)10);
   	}
	
	/**
	 *	Test condition 10 for isAr649ParmEndptId88()
	 *	@return  Returns true if isAr649ParmEndptId88() is 10
	 */
   public boolean isAr649ParmEndptId88() throws CFException {
      return (  getAr649ActionCode()  ==  10  );
   }


	/**
	*  set values 10
	*/
   	public void setAr649ParmEndptId88True() {  			
    	setAr649ActionCode( (short)10);
   	}
	
	/**
	 *	Test condition 11 for isAr649ParmBulkId88()
	 *	@return  Returns true if isAr649ParmBulkId88() is 11
	 */
   public boolean isAr649ParmBulkId88() throws CFException {
      return (  getAr649ActionCode()  ==  11  );
   }


	/**
	*  set values 11
	*/
   	public void setAr649ParmBulkId88True() {  			
    	setAr649ActionCode( (short)11);
   	}
	
	/**
	 *	Test condition 12 for isAr649ParmCyclNum88()
	 *	@return  Returns true if isAr649ParmCyclNum88() is 12
	 */
   public boolean isAr649ParmCyclNum88() throws CFException {
      return (  getAr649ActionCode()  ==  12  );
   }


	/**
	*  set values 12
	*/
   	public void setAr649ParmCyclNum88True() {  			
    	setAr649ActionCode( (short)12);
   	}
	
	/**
	 *	Test condition 13 for isAr649ParmEndptNotFtss88()
	 *	@return  Returns true if isAr649ParmEndptNotFtss88() is 13
	 */
   public boolean isAr649ParmEndptNotFtss88() throws CFException {
      return (  getAr649ActionCode()  ==  13  );
   }


	/**
	*  set values 13
	*/
   	public void setAr649ParmEndptNotFtss88True() {  			
    	setAr649ActionCode( (short)13);
   	}
	
	/**
	 *	Test condition 20 for isAr649ControlFileOpen88()
	 *	@return  Returns true if isAr649ControlFileOpen88() is 20
	 */
   public boolean isAr649ControlFileOpen88() throws CFException {
      return (  getAr649ActionCode()  ==  20  );
   }


	/**
	*  set values 20
	*/
   	public void setAr649ControlFileOpen88True() {  			
    	setAr649ActionCode( (short)20);
   	}
	
	/**
	 *	Test condition 21 for isAr649ControlFileRead88()
	 *	@return  Returns true if isAr649ControlFileRead88() is 21
	 */
   public boolean isAr649ControlFileRead88() throws CFException {
      return (  getAr649ActionCode()  ==  21  );
   }


	/**
	*  set values 21
	*/
   	public void setAr649ControlFileRead88True() {  			
    	setAr649ActionCode( (short)21);
   	}
	
	/**
	 *	Test condition 22 for isAr649ControlFileEmpty88()
	 *	@return  Returns true if isAr649ControlFileEmpty88() is 22
	 */
   public boolean isAr649ControlFileEmpty88() throws CFException {
      return (  getAr649ActionCode()  ==  22  );
   }


	/**
	*  set values 22
	*/
   	public void setAr649ControlFileEmpty88True() {  			
    	setAr649ActionCode( (short)22);
   	}
	
	/**
	 *	Test condition 23 for isAr649ControlFileClose88()
	 *	@return  Returns true if isAr649ControlFileClose88() is 23
	 */
   public boolean isAr649ControlFileClose88() throws CFException {
      return (  getAr649ActionCode()  ==  23  );
   }


	/**
	*  set values 23
	*/
   	public void setAr649ControlFileClose88True() {  			
    	setAr649ActionCode( (short)23);
   	}
	
	/**
	 *	Test condition 30 for isAr649ControlDataDbid88()
	 *	@return  Returns true if isAr649ControlDataDbid88() is 30
	 */
   public boolean isAr649ControlDataDbid88() throws CFException {
      return (  getAr649ActionCode()  ==  30  );
   }


	/**
	*  set values 30
	*/
   	public void setAr649ControlDataDbid88True() {  			
    	setAr649ActionCode( (short)30);
   	}
	
	/**
	 *	Test condition 31 for isAr649ControlDataPkgid88()
	 *	@return  Returns true if isAr649ControlDataPkgid88() is 31
	 */
   public boolean isAr649ControlDataPkgid88() throws CFException {
      return (  getAr649ActionCode()  ==  31  );
   }


	/**
	*  set values 31
	*/
   	public void setAr649ControlDataPkgid88True() {  			
    	setAr649ActionCode( (short)31);
   	}
	
	/**
	 *	Test condition 40 for isAr649Ar642Notification88()
	 *	@return  Returns true if isAr649Ar642Notification88() is 40
	 */
   public boolean isAr649Ar642Notification88() throws CFException {
      return (  getAr649ActionCode()  ==  40  );
   }


	/**
	*  set values 40
	*/
   	public void setAr649Ar642Notification88True() {  			
    	setAr649ActionCode( (short)40);
   	}
	
	/**
	 *	Test condition 41 for isAr649DynamInitialize88()
	 *	@return  Returns true if isAr649DynamInitialize88() is 41
	 */
   public boolean isAr649DynamInitialize88() throws CFException {
      return (  getAr649ActionCode()  ==  41  );
   }


	/**
	*  set values 41
	*/
   	public void setAr649DynamInitialize88True() {  			
    	setAr649ActionCode( (short)41);
   	}
	
	/**
	 *	Test condition 42 for isAr649DynamAllocate88()
	 *	@return  Returns true if isAr649DynamAllocate88() is 42
	 */
   public boolean isAr649DynamAllocate88() throws CFException {
      return (  getAr649ActionCode()  ==  42  );
   }


	/**
	*  set values 42
	*/
   	public void setAr649DynamAllocate88True() {  			
    	setAr649ActionCode( (short)42);
   	}
	
	/**
	 *	Test condition 43 for isAr649DynamInformation88()
	 *	@return  Returns true if isAr649DynamInformation88() is 43
	 */
   public boolean isAr649DynamInformation88() throws CFException {
      return (  getAr649ActionCode()  ==  43  );
   }


	/**
	*  set values 43
	*/
   	public void setAr649DynamInformation88True() {  			
    	setAr649ActionCode( (short)43);
   	}
	
	/**
	 *	Test condition 44 for isAr649DynamUnallocate88()
	 *	@return  Returns true if isAr649DynamUnallocate88() is 44
	 */
   public boolean isAr649DynamUnallocate88() throws CFException {
      return (  getAr649ActionCode()  ==  44  );
   }


	/**
	*  set values 44
	*/
   	public void setAr649DynamUnallocate88True() {  			
    	setAr649ActionCode( (short)44);
   	}
	
	/**
	 *	Test condition 45 for isAr649DynamEnd88()
	 *	@return  Returns true if isAr649DynamEnd88() is 45
	 */
   public boolean isAr649DynamEnd88() throws CFException {
      return (  getAr649ActionCode()  ==  45  );
   }


	/**
	*  set values 45
	*/
   	public void setAr649DynamEnd88True() {  			
    	setAr649ActionCode( (short)45);
   	}
	
	/**
	 *	Test condition 50 for isAr649ApplExitOpen88()
	 *	@return  Returns true if isAr649ApplExitOpen88() is 50
	 */
   public boolean isAr649ApplExitOpen88() throws CFException {
      return (  getAr649ActionCode()  ==  50  );
   }


	/**
	*  set values 50
	*/
   	public void setAr649ApplExitOpen88True() {  			
    	setAr649ActionCode( (short)50);
   	}
	
	/**
	 *	Test condition 51 for isAr649ApplExitRead88()
	 *	@return  Returns true if isAr649ApplExitRead88() is 51
	 */
   public boolean isAr649ApplExitRead88() throws CFException {
      return (  getAr649ActionCode()  ==  51  );
   }


	/**
	*  set values 51
	*/
   	public void setAr649ApplExitRead88True() {  			
    	setAr649ActionCode( (short)51);
   	}
	
	/**
	 *	Test condition 52 for isAr649ApplExitSize88()
	 *	@return  Returns true if isAr649ApplExitSize88() is 52
	 */
   public boolean isAr649ApplExitSize88() throws CFException {
      return (  getAr649ActionCode()  ==  52  );
   }


	/**
	*  set values 52
	*/
   	public void setAr649ApplExitSize88True() {  			
    	setAr649ActionCode( (short)52);
   	}
	
	/**
	 *	Test condition 53 for isAr649ApplExitFull88()
	 *	@return  Returns true if isAr649ApplExitFull88() is 53
	 */
   public boolean isAr649ApplExitFull88() throws CFException {
      return (  getAr649ActionCode()  ==  53  );
   }


	/**
	*  set values 53
	*/
   	public void setAr649ApplExitFull88True() {  			
    	setAr649ActionCode( (short)53);
   	}
	
	/**
	 *	Test condition 54 for isAr649ApplExitClose88()
	 *	@return  Returns true if isAr649ApplExitClose88() is 54
	 */
   public boolean isAr649ApplExitClose88() throws CFException {
      return (  getAr649ActionCode()  ==  54  );
   }


	/**
	*  set values 54
	*/
   	public void setAr649ApplExitClose88True() {  			
    	setAr649ActionCode( (short)54);
   	}
	
	/**
	 *	Test condition 60 for isAr649SqlUserDbStore88()
	 *	@return  Returns true if isAr649SqlUserDbStore88() is 60
	 */
   public boolean isAr649SqlUserDbStore88() throws CFException {
      return (  getAr649ActionCode()  ==  60  );
   }


	/**
	*  set values 60
	*/
   	public void setAr649SqlUserDbStore88True() {  			
    	setAr649ActionCode( (short)60);
   	}
	
	/**
	 *	Test condition 61 for isAr649SqlUserPkgStore88()
	 *	@return  Returns true if isAr649SqlUserPkgStore88() is 61
	 */
   public boolean isAr649SqlUserPkgStore88() throws CFException {
      return (  getAr649ActionCode()  ==  61  );
   }


	/**
	*  set values 61
	*/
   	public void setAr649SqlUserPkgStore88True() {  			
    	setAr649ActionCode( (short)61);
   	}
	
	/**
	 *	Test condition 62 for isAr649SqlGftPkgSet88()
	 *	@return  Returns true if isAr649SqlGftPkgSet88() is 62
	 */
   public boolean isAr649SqlGftPkgSet88() throws CFException {
      return (  getAr649ActionCode()  ==  62  );
   }


	/**
	*  set values 62
	*/
   	public void setAr649SqlGftPkgSet88True() {  			
    	setAr649ActionCode( (short)62);
   	}
	
	/**
	 *	Test condition 63 for isAr649SqlGftDbConnect88()
	 *	@return  Returns true if isAr649SqlGftDbConnect88() is 63
	 */
   public boolean isAr649SqlGftDbConnect88() throws CFException {
      return (  getAr649ActionCode()  ==  63  );
   }


	/**
	*  set values 63
	*/
   	public void setAr649SqlGftDbConnect88True() {  			
    	setAr649ActionCode( (short)63);
   	}
	
	/**
	 *	Test condition 64 for isAr649SqlGftDbRelease88()
	 *	@return  Returns true if isAr649SqlGftDbRelease88() is 64
	 */
   public boolean isAr649SqlGftDbRelease88() throws CFException {
      return (  getAr649ActionCode()  ==  64  );
   }


	/**
	*  set values 64
	*/
   	public void setAr649SqlGftDbRelease88True() {  			
    	setAr649ActionCode( (short)64);
   	}
	
	/**
	 *	Test condition 65 for isAr649SqlUserPkgSet88()
	 *	@return  Returns true if isAr649SqlUserPkgSet88() is 65
	 */
   public boolean isAr649SqlUserPkgSet88() throws CFException {
      return (  getAr649ActionCode()  ==  65  );
   }


	/**
	*  set values 65
	*/
   	public void setAr649SqlUserPkgSet88True() {  			
    	setAr649ActionCode( (short)65);
   	}
	
	/**
	 *	Test condition 66 for isAr649SqlUserDbConnect88()
	 *	@return  Returns true if isAr649SqlUserDbConnect88() is 66
	 */
   public boolean isAr649SqlUserDbConnect88() throws CFException {
      return (  getAr649ActionCode()  ==  66  );
   }


	/**
	*  set values 66
	*/
   	public void setAr649SqlUserDbConnect88True() {  			
    	setAr649ActionCode( (short)66);
   	}
	
	/**
	 *	Test condition 67 for isAr649SqlDbRelease88()
	 *	@return  Returns true if isAr649SqlDbRelease88() is 67
	 */
   public boolean isAr649SqlDbRelease88() throws CFException {
      return (  getAr649ActionCode()  ==  67  );
   }


	/**
	*  set values 67
	*/
   	public void setAr649SqlDbRelease88True() {  			
    	setAr649ActionCode( (short)67);
   	}
	
	/**
	 *	Test condition 68 for isAr649SqlDbReleaseCommit88()
	 *	@return  Returns true if isAr649SqlDbReleaseCommit88() is 68
	 */
   public boolean isAr649SqlDbReleaseCommit88() throws CFException {
      return (  getAr649ActionCode()  ==  68  );
   }


	/**
	*  set values 68
	*/
   	public void setAr649SqlDbReleaseCommit88True() {  			
    	setAr649ActionCode( (short)68);
   	}
	
	/**
	 *	Test condition 70 for isAr649SqlEfpError88()
	 *	@return  Returns true if isAr649SqlEfpError88() is 70
	 */
   public boolean isAr649SqlEfpError88() throws CFException {
      return (  getAr649ActionCode()  ==  70  );
   }


	/**
	*  set values 70
	*/
   	public void setAr649SqlEfpError88True() {  			
    	setAr649ActionCode( (short)70);
   	}
	
	/**
	 *	Test condition 71 for isAr649SqlEfpInsert88()
	 *	@return  Returns true if isAr649SqlEfpInsert88() is 71
	 */
   public boolean isAr649SqlEfpInsert88() throws CFException {
      return (  getAr649ActionCode()  ==  71  );
   }


	/**
	*  set values 71
	*/
   	public void setAr649SqlEfpInsert88True() {  			
    	setAr649ActionCode( (short)71);
   	}
	
	/**
	 *	Test condition 72 for isAr649SqlEfpInsertCommit88()
	 *	@return  Returns true if isAr649SqlEfpInsertCommit88() is 72
	 */
   public boolean isAr649SqlEfpInsertCommit88() throws CFException {
      return (  getAr649ActionCode()  ==  72  );
   }


	/**
	*  set values 72
	*/
   	public void setAr649SqlEfpInsertCommit88True() {  			
    	setAr649ActionCode( (short)72);
   	}
	
	/**
	 *	Test condition 73 for isAr649SqlEptError88()
	 *	@return  Returns true if isAr649SqlEptError88() is 73
	 */
   public boolean isAr649SqlEptError88() throws CFException {
      return (  getAr649ActionCode()  ==  73  );
   }


	/**
	*  set values 73
	*/
   	public void setAr649SqlEptError88True() {  			
    	setAr649ActionCode( (short)73);
   	}
	
	/**
	 *	Test condition 74 for isAr649SqlEptNotFound88()
	 *	@return  Returns true if isAr649SqlEptNotFound88() is 74
	 */
   public boolean isAr649SqlEptNotFound88() throws CFException {
      return (  getAr649ActionCode()  ==  74  );
   }


	/**
	*  set values 74
	*/
   	public void setAr649SqlEptNotFound88True() {  			
    	setAr649ActionCode( (short)74);
   	}
	
	/**
	 *	Test condition 75 for isAr649SqlXtkError88()
	 *	@return  Returns true if isAr649SqlXtkError88() is 75
	 */
   public boolean isAr649SqlXtkError88() throws CFException {
      return (  getAr649ActionCode()  ==  75  );
   }


	/**
	*  set values 75
	*/
   	public void setAr649SqlXtkError88True() {  			
    	setAr649ActionCode( (short)75);
   	}
	
	/**
	 *	Test condition 76 for isAr649SqlXtkNotFound88()
	 *	@return  Returns true if isAr649SqlXtkNotFound88() is 76
	 */
   public boolean isAr649SqlXtkNotFound88() throws CFException {
      return (  getAr649ActionCode()  ==  76  );
   }


	/**
	*  set values 76
	*/
   	public void setAr649SqlXtkNotFound88True() {  			
    	setAr649ActionCode( (short)76);
   	}
	
	/**
	 *	Test condition 100 for isAr649EntryAfterFatality88()
	 *	@return  Returns true if isAr649EntryAfterFatality88() is 100
	 */
   public boolean isAr649EntryAfterFatality88() throws CFException {
      return (  getAr649ActionCode()  ==  100  );
   }


	/**
	*  set values 100
	*/
   	public void setAr649EntryAfterFatality88True() {  			
    	setAr649ActionCode( (short)100);
   	}
	/**
	 *	Returns the value of ar649XferMthdCd
	 *	@return ar649XferMthdCd
	 */
   public char[] getAr649XferMthdCd() throws CFException{
     if (isAr649XferMthdCdModified()) { 
        ar649XferMthdCd = refreshAr649XferMthdCd();
     }
   		return ar649XferMthdCd;
   }

  
	/**
	*  set variable ar649XferMthdCd
	*  Corresponding COBOL Variable is AR649-XFER-MTHD-CD
	*  @param value
	**/
   public void setAr649XferMthdCd(char[] value) {
      ar649XferMthdCd = checkAr649XferMthdCdConstraints(value);
      serializeAr649XferMthdCd(ar649XferMthdCd);
   } 

     /**
	 * 	Update Ar649XferMthdCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr649XferMthdCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr649XferMthdCd,ar649XferMthdCd.length);
   	
   }
   
   public void setAr649XferMthdCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr649XferMthdCd,ar649XferMthdCd.length);
   	
   }
   
     /**
	 * 	Update Ar649XferMthdCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr649XferMthdCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649XferMthdCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar649XferMthdCd with another Field
	 *	@param value
	 */
   public void setAr649XferMthdCd(Field source) {
       replace(source,0,source.length(),beginAr649XferMthdCd,AR_649_XFER_MTHD_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ar649XferMthdCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr649XferMthdCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr649XferMthdCd,AR_649_XFER_MTHD_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ar649XferMthdCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr649XferMthdCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649XferMthdCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ar649CommitActionCd
	 *	@return ar649CommitActionCd
	 */
   public char[] getAr649CommitActionCd() throws CFException{
     if (isAr649CommitActionCdModified()) { 
        ar649CommitActionCd = refreshAr649CommitActionCd();
     }
   		return ar649CommitActionCd;
   }

  
	/**
	*  set variable ar649CommitActionCd
	*  Corresponding COBOL Variable is AR649-COMMIT-ACTION-CD
	*  @param value
	**/
   public void setAr649CommitActionCd(char[] value) {
      ar649CommitActionCd = checkAr649CommitActionCdConstraints(value);
      serializeAr649CommitActionCd(ar649CommitActionCd);
   } 

     /**
	 * 	Update Ar649CommitActionCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAr649CommitActionCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAr649CommitActionCd,ar649CommitActionCd.length);
   	
   }
   
   public void setAr649CommitActionCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAr649CommitActionCd,ar649CommitActionCd.length);
   	
   }
   
     /**
	 * 	Update Ar649CommitActionCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAr649CommitActionCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649CommitActionCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ar649CommitActionCd with another Field
	 *	@param value
	 */
   public void setAr649CommitActionCd(Field source) {
       replace(source,0,source.length(),beginAr649CommitActionCd,AR_649_COMMIT_ACTION_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ar649CommitActionCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAr649CommitActionCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAr649CommitActionCd,AR_649_COMMIT_ACTION_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ar649CommitActionCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAr649CommitActionCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAr649CommitActionCd+targetIndex,targetLen);
    
   }
	char[] ar649PerformCommit8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isAr649PerformCommit88()
	 *	@return  Returns true if isAr649PerformCommit88() is "Y"
	 */
   public boolean isAr649PerformCommit88() throws CFException {
      return (  compareChars( getAr649CommitActionCd() , ar649PerformCommit8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setAr649PerformCommit88True() {  			
    	setAr649CommitActionCd( ar649PerformCommit8888Value);
   	}
	char[] ar649PerformNoCommit8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isAr649PerformNoCommit88()
	 *	@return  Returns true if isAr649PerformNoCommit88() is "N"
	 */
   public boolean isAr649PerformNoCommit88() throws CFException {
      return (  compareChars( getAr649CommitActionCd() , ar649PerformNoCommit8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setAr649PerformNoCommit88True() {  			
    	setAr649CommitActionCd( ar649PerformNoCommit8888Value);
   	}

	
	
	

		public static int getAr649ParametersFieldLength() {
			return AR_649_PARAMETERS_LENGTH;
		}

}
  
