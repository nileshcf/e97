package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup68Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup68Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup68Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_68_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2078S;
            protected  int beginIp65504P2078L;
            protected  int beginIp65504P2079S;
            protected  int beginIp65504P2079L;
            protected  int beginIp65504P2080S;
            protected  int beginIp65504P2080L;
            protected  int beginIp65504P2081S;
            protected  int beginIp65504P2081L;
            protected  int beginIp65504P2082S;
            protected  int beginIp65504P2082L;
            protected  int beginIp65504P2083S;
            protected  int beginIp65504P2083L;
            protected  int beginIp65504P2084S;
            protected  int beginIp65504P2084L;
            protected  int beginIp65504P2085S;
            protected  int beginIp65504P2085L;
            protected  int beginIp65504P2086S;
            protected  int beginIp65504P2086L;
            protected  int beginIp65504P2087S;
            protected  int beginIp65504P2087L;
            protected  int beginIp65504P2088S;
            protected  int beginIp65504P2088L;
            protected  int beginIp65504P2089S;
            protected  int beginIp65504P2089L;
            protected  int beginIp65504P2090S;
            protected  int beginIp65504P2090L;
            protected  int beginIp65504P2091S;
            protected  int beginIp65504P2091L;
            protected  int beginIp65504P2092S;
            protected  int beginIp65504P2092L;
            protected  int beginIp65504P2093S;
            protected  int beginIp65504P2093L;
            protected  int beginIp65504P2094S;
            protected  int beginIp65504P2094L;
            protected  int beginIp65504P2095S;
            protected  int beginIp65504P2095L;
            protected  int beginIp65504P2096S;
            protected  int beginIp65504P2096L;
            protected  int beginIp65504P2097S;
            protected  int beginIp65504P2097L;
            protected  int beginIp65504P2098S;
            protected  int beginIp65504P2098L;
            protected  int beginIp65504P2099S;
            protected  int beginIp65504P2099L;
            protected  int beginIp65504P2100S;
            protected  int beginIp65504P2100L;
            protected  int beginIp65504P2101S;
            protected  int beginIp65504P2101L;
            protected  int beginIp65504P2102S;
            protected  int beginIp65504P2102L;
            protected  int beginIp65504P2103S;
            protected  int beginIp65504P2103L;
            protected  int beginIp65504P2104S;
            protected  int beginIp65504P2104L;
            protected  int beginIp65504P2105S;
            protected  int beginIp65504P2105L;
            protected  int beginIp65504P2106S;
            protected  int beginIp65504P2106L;
            protected  int beginIp65504P2107S;
            protected  int beginIp65504P2107L;
            protected  int beginIp65504P2108S;
            protected  int beginIp65504P2108L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup68Serialized
	**/
    public Ip65504PdsNamesLargeGroup68Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup68Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup68Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup68Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16612); // serialize this field at offset 16612 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup68Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16612 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup68Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_68_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2078S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2078L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2079S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2079L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2080S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2080L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2081S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2081L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2082S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2082L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2083S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2083L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2084S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2084L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2085S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2085L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2086S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2086L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2087S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2087L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2088S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2088L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2089S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2089L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2090S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2090L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2091S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2091L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2092S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2092L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2093S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2093L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2094S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2094L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2095S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2095L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2096S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2096L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2097S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2097L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2098S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2098L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2099S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2099L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2100S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2100L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2101S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2101L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2102S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2102L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2103S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2103L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2104S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2104L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2105S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2105L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2106S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2106L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2107S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2107L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2108S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2108L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2078SCounter = -1;
         public boolean isIp65504P2078SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2078SCounter != sharedCounter;
            localIp65504P2078SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2078_S_LEN = 2;
  	/**
	 * serializeIp65504P2078S
	 */
	protected void serializeIp65504P2078S(short ip65504P2078S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2078S,IP_65504_P_2078_S_LEN)
                  ,beginIp65504P2078S
                  ,IP_65504_P_2078_S_LEN
                 );
            localIp65504P2078SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2078SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2078S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2078S() {	 
			return (getShort(beginIp65504P2078S));
   	}
         int localIp65504P2078LCounter = -1;
         public boolean isIp65504P2078LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2078LCounter != sharedCounter;
            localIp65504P2078LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2078_L_LEN = 2;
  	/**
	 * serializeIp65504P2078L
	 */
	protected void serializeIp65504P2078L(short ip65504P2078L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2078L,IP_65504_P_2078_L_LEN)
                  ,beginIp65504P2078L
                  ,IP_65504_P_2078_L_LEN
                 );
            localIp65504P2078LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2078LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2078L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2078L() {	 
			return (getShort(beginIp65504P2078L));
   	}
         int localIp65504P2079SCounter = -1;
         public boolean isIp65504P2079SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2079SCounter != sharedCounter;
            localIp65504P2079SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2079_S_LEN = 2;
  	/**
	 * serializeIp65504P2079S
	 */
	protected void serializeIp65504P2079S(short ip65504P2079S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2079S,IP_65504_P_2079_S_LEN)
                  ,beginIp65504P2079S
                  ,IP_65504_P_2079_S_LEN
                 );
            localIp65504P2079SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2079SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2079S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2079S() {	 
			return (getShort(beginIp65504P2079S));
   	}
         int localIp65504P2079LCounter = -1;
         public boolean isIp65504P2079LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2079LCounter != sharedCounter;
            localIp65504P2079LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2079_L_LEN = 2;
  	/**
	 * serializeIp65504P2079L
	 */
	protected void serializeIp65504P2079L(short ip65504P2079L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2079L,IP_65504_P_2079_L_LEN)
                  ,beginIp65504P2079L
                  ,IP_65504_P_2079_L_LEN
                 );
            localIp65504P2079LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2079LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2079L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2079L() {	 
			return (getShort(beginIp65504P2079L));
   	}
         int localIp65504P2080SCounter = -1;
         public boolean isIp65504P2080SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2080SCounter != sharedCounter;
            localIp65504P2080SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2080_S_LEN = 2;
  	/**
	 * serializeIp65504P2080S
	 */
	protected void serializeIp65504P2080S(short ip65504P2080S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2080S,IP_65504_P_2080_S_LEN)
                  ,beginIp65504P2080S
                  ,IP_65504_P_2080_S_LEN
                 );
            localIp65504P2080SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2080SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2080S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2080S() {	 
			return (getShort(beginIp65504P2080S));
   	}
         int localIp65504P2080LCounter = -1;
         public boolean isIp65504P2080LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2080LCounter != sharedCounter;
            localIp65504P2080LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2080_L_LEN = 2;
  	/**
	 * serializeIp65504P2080L
	 */
	protected void serializeIp65504P2080L(short ip65504P2080L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2080L,IP_65504_P_2080_L_LEN)
                  ,beginIp65504P2080L
                  ,IP_65504_P_2080_L_LEN
                 );
            localIp65504P2080LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2080LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2080L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2080L() {	 
			return (getShort(beginIp65504P2080L));
   	}
         int localIp65504P2081SCounter = -1;
         public boolean isIp65504P2081SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2081SCounter != sharedCounter;
            localIp65504P2081SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2081_S_LEN = 2;
  	/**
	 * serializeIp65504P2081S
	 */
	protected void serializeIp65504P2081S(short ip65504P2081S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2081S,IP_65504_P_2081_S_LEN)
                  ,beginIp65504P2081S
                  ,IP_65504_P_2081_S_LEN
                 );
            localIp65504P2081SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2081SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2081S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2081S() {	 
			return (getShort(beginIp65504P2081S));
   	}
         int localIp65504P2081LCounter = -1;
         public boolean isIp65504P2081LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2081LCounter != sharedCounter;
            localIp65504P2081LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2081_L_LEN = 2;
  	/**
	 * serializeIp65504P2081L
	 */
	protected void serializeIp65504P2081L(short ip65504P2081L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2081L,IP_65504_P_2081_L_LEN)
                  ,beginIp65504P2081L
                  ,IP_65504_P_2081_L_LEN
                 );
            localIp65504P2081LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2081LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2081L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2081L() {	 
			return (getShort(beginIp65504P2081L));
   	}
         int localIp65504P2082SCounter = -1;
         public boolean isIp65504P2082SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2082SCounter != sharedCounter;
            localIp65504P2082SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2082_S_LEN = 2;
  	/**
	 * serializeIp65504P2082S
	 */
	protected void serializeIp65504P2082S(short ip65504P2082S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2082S,IP_65504_P_2082_S_LEN)
                  ,beginIp65504P2082S
                  ,IP_65504_P_2082_S_LEN
                 );
            localIp65504P2082SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2082SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2082S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2082S() {	 
			return (getShort(beginIp65504P2082S));
   	}
         int localIp65504P2082LCounter = -1;
         public boolean isIp65504P2082LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2082LCounter != sharedCounter;
            localIp65504P2082LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2082_L_LEN = 2;
  	/**
	 * serializeIp65504P2082L
	 */
	protected void serializeIp65504P2082L(short ip65504P2082L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2082L,IP_65504_P_2082_L_LEN)
                  ,beginIp65504P2082L
                  ,IP_65504_P_2082_L_LEN
                 );
            localIp65504P2082LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2082LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2082L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2082L() {	 
			return (getShort(beginIp65504P2082L));
   	}
         int localIp65504P2083SCounter = -1;
         public boolean isIp65504P2083SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2083SCounter != sharedCounter;
            localIp65504P2083SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2083_S_LEN = 2;
  	/**
	 * serializeIp65504P2083S
	 */
	protected void serializeIp65504P2083S(short ip65504P2083S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2083S,IP_65504_P_2083_S_LEN)
                  ,beginIp65504P2083S
                  ,IP_65504_P_2083_S_LEN
                 );
            localIp65504P2083SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2083SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2083S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2083S() {	 
			return (getShort(beginIp65504P2083S));
   	}
         int localIp65504P2083LCounter = -1;
         public boolean isIp65504P2083LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2083LCounter != sharedCounter;
            localIp65504P2083LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2083_L_LEN = 2;
  	/**
	 * serializeIp65504P2083L
	 */
	protected void serializeIp65504P2083L(short ip65504P2083L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2083L,IP_65504_P_2083_L_LEN)
                  ,beginIp65504P2083L
                  ,IP_65504_P_2083_L_LEN
                 );
            localIp65504P2083LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2083LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2083L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2083L() {	 
			return (getShort(beginIp65504P2083L));
   	}
         int localIp65504P2084SCounter = -1;
         public boolean isIp65504P2084SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2084SCounter != sharedCounter;
            localIp65504P2084SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2084_S_LEN = 2;
  	/**
	 * serializeIp65504P2084S
	 */
	protected void serializeIp65504P2084S(short ip65504P2084S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2084S,IP_65504_P_2084_S_LEN)
                  ,beginIp65504P2084S
                  ,IP_65504_P_2084_S_LEN
                 );
            localIp65504P2084SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2084SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2084S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2084S() {	 
			return (getShort(beginIp65504P2084S));
   	}
         int localIp65504P2084LCounter = -1;
         public boolean isIp65504P2084LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2084LCounter != sharedCounter;
            localIp65504P2084LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2084_L_LEN = 2;
  	/**
	 * serializeIp65504P2084L
	 */
	protected void serializeIp65504P2084L(short ip65504P2084L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2084L,IP_65504_P_2084_L_LEN)
                  ,beginIp65504P2084L
                  ,IP_65504_P_2084_L_LEN
                 );
            localIp65504P2084LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2084LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2084L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2084L() {	 
			return (getShort(beginIp65504P2084L));
   	}
         int localIp65504P2085SCounter = -1;
         public boolean isIp65504P2085SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2085SCounter != sharedCounter;
            localIp65504P2085SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2085_S_LEN = 2;
  	/**
	 * serializeIp65504P2085S
	 */
	protected void serializeIp65504P2085S(short ip65504P2085S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2085S,IP_65504_P_2085_S_LEN)
                  ,beginIp65504P2085S
                  ,IP_65504_P_2085_S_LEN
                 );
            localIp65504P2085SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2085SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2085S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2085S() {	 
			return (getShort(beginIp65504P2085S));
   	}
         int localIp65504P2085LCounter = -1;
         public boolean isIp65504P2085LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2085LCounter != sharedCounter;
            localIp65504P2085LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2085_L_LEN = 2;
  	/**
	 * serializeIp65504P2085L
	 */
	protected void serializeIp65504P2085L(short ip65504P2085L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2085L,IP_65504_P_2085_L_LEN)
                  ,beginIp65504P2085L
                  ,IP_65504_P_2085_L_LEN
                 );
            localIp65504P2085LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2085LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2085L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2085L() {	 
			return (getShort(beginIp65504P2085L));
   	}
         int localIp65504P2086SCounter = -1;
         public boolean isIp65504P2086SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2086SCounter != sharedCounter;
            localIp65504P2086SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2086_S_LEN = 2;
  	/**
	 * serializeIp65504P2086S
	 */
	protected void serializeIp65504P2086S(short ip65504P2086S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2086S,IP_65504_P_2086_S_LEN)
                  ,beginIp65504P2086S
                  ,IP_65504_P_2086_S_LEN
                 );
            localIp65504P2086SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2086SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2086S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2086S() {	 
			return (getShort(beginIp65504P2086S));
   	}
         int localIp65504P2086LCounter = -1;
         public boolean isIp65504P2086LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2086LCounter != sharedCounter;
            localIp65504P2086LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2086_L_LEN = 2;
  	/**
	 * serializeIp65504P2086L
	 */
	protected void serializeIp65504P2086L(short ip65504P2086L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2086L,IP_65504_P_2086_L_LEN)
                  ,beginIp65504P2086L
                  ,IP_65504_P_2086_L_LEN
                 );
            localIp65504P2086LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2086LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2086L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2086L() {	 
			return (getShort(beginIp65504P2086L));
   	}
         int localIp65504P2087SCounter = -1;
         public boolean isIp65504P2087SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2087SCounter != sharedCounter;
            localIp65504P2087SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2087_S_LEN = 2;
  	/**
	 * serializeIp65504P2087S
	 */
	protected void serializeIp65504P2087S(short ip65504P2087S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2087S,IP_65504_P_2087_S_LEN)
                  ,beginIp65504P2087S
                  ,IP_65504_P_2087_S_LEN
                 );
            localIp65504P2087SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2087SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2087S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2087S() {	 
			return (getShort(beginIp65504P2087S));
   	}
         int localIp65504P2087LCounter = -1;
         public boolean isIp65504P2087LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2087LCounter != sharedCounter;
            localIp65504P2087LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2087_L_LEN = 2;
  	/**
	 * serializeIp65504P2087L
	 */
	protected void serializeIp65504P2087L(short ip65504P2087L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2087L,IP_65504_P_2087_L_LEN)
                  ,beginIp65504P2087L
                  ,IP_65504_P_2087_L_LEN
                 );
            localIp65504P2087LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2087LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2087L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2087L() {	 
			return (getShort(beginIp65504P2087L));
   	}
         int localIp65504P2088SCounter = -1;
         public boolean isIp65504P2088SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2088SCounter != sharedCounter;
            localIp65504P2088SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2088_S_LEN = 2;
  	/**
	 * serializeIp65504P2088S
	 */
	protected void serializeIp65504P2088S(short ip65504P2088S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2088S,IP_65504_P_2088_S_LEN)
                  ,beginIp65504P2088S
                  ,IP_65504_P_2088_S_LEN
                 );
            localIp65504P2088SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2088SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2088S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2088S() {	 
			return (getShort(beginIp65504P2088S));
   	}
         int localIp65504P2088LCounter = -1;
         public boolean isIp65504P2088LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2088LCounter != sharedCounter;
            localIp65504P2088LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2088_L_LEN = 2;
  	/**
	 * serializeIp65504P2088L
	 */
	protected void serializeIp65504P2088L(short ip65504P2088L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2088L,IP_65504_P_2088_L_LEN)
                  ,beginIp65504P2088L
                  ,IP_65504_P_2088_L_LEN
                 );
            localIp65504P2088LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2088LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2088L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2088L() {	 
			return (getShort(beginIp65504P2088L));
   	}
         int localIp65504P2089SCounter = -1;
         public boolean isIp65504P2089SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2089SCounter != sharedCounter;
            localIp65504P2089SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2089_S_LEN = 2;
  	/**
	 * serializeIp65504P2089S
	 */
	protected void serializeIp65504P2089S(short ip65504P2089S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2089S,IP_65504_P_2089_S_LEN)
                  ,beginIp65504P2089S
                  ,IP_65504_P_2089_S_LEN
                 );
            localIp65504P2089SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2089SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2089S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2089S() {	 
			return (getShort(beginIp65504P2089S));
   	}
         int localIp65504P2089LCounter = -1;
         public boolean isIp65504P2089LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2089LCounter != sharedCounter;
            localIp65504P2089LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2089_L_LEN = 2;
  	/**
	 * serializeIp65504P2089L
	 */
	protected void serializeIp65504P2089L(short ip65504P2089L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2089L,IP_65504_P_2089_L_LEN)
                  ,beginIp65504P2089L
                  ,IP_65504_P_2089_L_LEN
                 );
            localIp65504P2089LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2089LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2089L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2089L() {	 
			return (getShort(beginIp65504P2089L));
   	}
         int localIp65504P2090SCounter = -1;
         public boolean isIp65504P2090SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2090SCounter != sharedCounter;
            localIp65504P2090SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2090_S_LEN = 2;
  	/**
	 * serializeIp65504P2090S
	 */
	protected void serializeIp65504P2090S(short ip65504P2090S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2090S,IP_65504_P_2090_S_LEN)
                  ,beginIp65504P2090S
                  ,IP_65504_P_2090_S_LEN
                 );
            localIp65504P2090SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2090SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2090S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2090S() {	 
			return (getShort(beginIp65504P2090S));
   	}
         int localIp65504P2090LCounter = -1;
         public boolean isIp65504P2090LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2090LCounter != sharedCounter;
            localIp65504P2090LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2090_L_LEN = 2;
  	/**
	 * serializeIp65504P2090L
	 */
	protected void serializeIp65504P2090L(short ip65504P2090L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2090L,IP_65504_P_2090_L_LEN)
                  ,beginIp65504P2090L
                  ,IP_65504_P_2090_L_LEN
                 );
            localIp65504P2090LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2090LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2090L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2090L() {	 
			return (getShort(beginIp65504P2090L));
   	}
         int localIp65504P2091SCounter = -1;
         public boolean isIp65504P2091SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2091SCounter != sharedCounter;
            localIp65504P2091SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2091_S_LEN = 2;
  	/**
	 * serializeIp65504P2091S
	 */
	protected void serializeIp65504P2091S(short ip65504P2091S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2091S,IP_65504_P_2091_S_LEN)
                  ,beginIp65504P2091S
                  ,IP_65504_P_2091_S_LEN
                 );
            localIp65504P2091SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2091SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2091S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2091S() {	 
			return (getShort(beginIp65504P2091S));
   	}
         int localIp65504P2091LCounter = -1;
         public boolean isIp65504P2091LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2091LCounter != sharedCounter;
            localIp65504P2091LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2091_L_LEN = 2;
  	/**
	 * serializeIp65504P2091L
	 */
	protected void serializeIp65504P2091L(short ip65504P2091L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2091L,IP_65504_P_2091_L_LEN)
                  ,beginIp65504P2091L
                  ,IP_65504_P_2091_L_LEN
                 );
            localIp65504P2091LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2091LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2091L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2091L() {	 
			return (getShort(beginIp65504P2091L));
   	}
         int localIp65504P2092SCounter = -1;
         public boolean isIp65504P2092SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2092SCounter != sharedCounter;
            localIp65504P2092SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2092_S_LEN = 2;
  	/**
	 * serializeIp65504P2092S
	 */
	protected void serializeIp65504P2092S(short ip65504P2092S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2092S,IP_65504_P_2092_S_LEN)
                  ,beginIp65504P2092S
                  ,IP_65504_P_2092_S_LEN
                 );
            localIp65504P2092SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2092SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2092S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2092S() {	 
			return (getShort(beginIp65504P2092S));
   	}
         int localIp65504P2092LCounter = -1;
         public boolean isIp65504P2092LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2092LCounter != sharedCounter;
            localIp65504P2092LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2092_L_LEN = 2;
  	/**
	 * serializeIp65504P2092L
	 */
	protected void serializeIp65504P2092L(short ip65504P2092L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2092L,IP_65504_P_2092_L_LEN)
                  ,beginIp65504P2092L
                  ,IP_65504_P_2092_L_LEN
                 );
            localIp65504P2092LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2092LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2092L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2092L() {	 
			return (getShort(beginIp65504P2092L));
   	}
         int localIp65504P2093SCounter = -1;
         public boolean isIp65504P2093SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2093SCounter != sharedCounter;
            localIp65504P2093SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2093_S_LEN = 2;
  	/**
	 * serializeIp65504P2093S
	 */
	protected void serializeIp65504P2093S(short ip65504P2093S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2093S,IP_65504_P_2093_S_LEN)
                  ,beginIp65504P2093S
                  ,IP_65504_P_2093_S_LEN
                 );
            localIp65504P2093SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2093SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2093S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2093S() {	 
			return (getShort(beginIp65504P2093S));
   	}
         int localIp65504P2093LCounter = -1;
         public boolean isIp65504P2093LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2093LCounter != sharedCounter;
            localIp65504P2093LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2093_L_LEN = 2;
  	/**
	 * serializeIp65504P2093L
	 */
	protected void serializeIp65504P2093L(short ip65504P2093L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2093L,IP_65504_P_2093_L_LEN)
                  ,beginIp65504P2093L
                  ,IP_65504_P_2093_L_LEN
                 );
            localIp65504P2093LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2093LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2093L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2093L() {	 
			return (getShort(beginIp65504P2093L));
   	}
         int localIp65504P2094SCounter = -1;
         public boolean isIp65504P2094SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2094SCounter != sharedCounter;
            localIp65504P2094SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2094_S_LEN = 2;
  	/**
	 * serializeIp65504P2094S
	 */
	protected void serializeIp65504P2094S(short ip65504P2094S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2094S,IP_65504_P_2094_S_LEN)
                  ,beginIp65504P2094S
                  ,IP_65504_P_2094_S_LEN
                 );
            localIp65504P2094SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2094SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2094S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2094S() {	 
			return (getShort(beginIp65504P2094S));
   	}
         int localIp65504P2094LCounter = -1;
         public boolean isIp65504P2094LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2094LCounter != sharedCounter;
            localIp65504P2094LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2094_L_LEN = 2;
  	/**
	 * serializeIp65504P2094L
	 */
	protected void serializeIp65504P2094L(short ip65504P2094L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2094L,IP_65504_P_2094_L_LEN)
                  ,beginIp65504P2094L
                  ,IP_65504_P_2094_L_LEN
                 );
            localIp65504P2094LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2094LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2094L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2094L() {	 
			return (getShort(beginIp65504P2094L));
   	}
         int localIp65504P2095SCounter = -1;
         public boolean isIp65504P2095SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2095SCounter != sharedCounter;
            localIp65504P2095SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2095_S_LEN = 2;
  	/**
	 * serializeIp65504P2095S
	 */
	protected void serializeIp65504P2095S(short ip65504P2095S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2095S,IP_65504_P_2095_S_LEN)
                  ,beginIp65504P2095S
                  ,IP_65504_P_2095_S_LEN
                 );
            localIp65504P2095SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2095SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2095S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2095S() {	 
			return (getShort(beginIp65504P2095S));
   	}
         int localIp65504P2095LCounter = -1;
         public boolean isIp65504P2095LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2095LCounter != sharedCounter;
            localIp65504P2095LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2095_L_LEN = 2;
  	/**
	 * serializeIp65504P2095L
	 */
	protected void serializeIp65504P2095L(short ip65504P2095L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2095L,IP_65504_P_2095_L_LEN)
                  ,beginIp65504P2095L
                  ,IP_65504_P_2095_L_LEN
                 );
            localIp65504P2095LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2095LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2095L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2095L() {	 
			return (getShort(beginIp65504P2095L));
   	}
         int localIp65504P2096SCounter = -1;
         public boolean isIp65504P2096SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2096SCounter != sharedCounter;
            localIp65504P2096SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2096_S_LEN = 2;
  	/**
	 * serializeIp65504P2096S
	 */
	protected void serializeIp65504P2096S(short ip65504P2096S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2096S,IP_65504_P_2096_S_LEN)
                  ,beginIp65504P2096S
                  ,IP_65504_P_2096_S_LEN
                 );
            localIp65504P2096SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2096SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2096S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2096S() {	 
			return (getShort(beginIp65504P2096S));
   	}
         int localIp65504P2096LCounter = -1;
         public boolean isIp65504P2096LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2096LCounter != sharedCounter;
            localIp65504P2096LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2096_L_LEN = 2;
  	/**
	 * serializeIp65504P2096L
	 */
	protected void serializeIp65504P2096L(short ip65504P2096L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2096L,IP_65504_P_2096_L_LEN)
                  ,beginIp65504P2096L
                  ,IP_65504_P_2096_L_LEN
                 );
            localIp65504P2096LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2096LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2096L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2096L() {	 
			return (getShort(beginIp65504P2096L));
   	}
         int localIp65504P2097SCounter = -1;
         public boolean isIp65504P2097SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2097SCounter != sharedCounter;
            localIp65504P2097SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2097_S_LEN = 2;
  	/**
	 * serializeIp65504P2097S
	 */
	protected void serializeIp65504P2097S(short ip65504P2097S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2097S,IP_65504_P_2097_S_LEN)
                  ,beginIp65504P2097S
                  ,IP_65504_P_2097_S_LEN
                 );
            localIp65504P2097SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2097SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2097S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2097S() {	 
			return (getShort(beginIp65504P2097S));
   	}
         int localIp65504P2097LCounter = -1;
         public boolean isIp65504P2097LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2097LCounter != sharedCounter;
            localIp65504P2097LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2097_L_LEN = 2;
  	/**
	 * serializeIp65504P2097L
	 */
	protected void serializeIp65504P2097L(short ip65504P2097L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2097L,IP_65504_P_2097_L_LEN)
                  ,beginIp65504P2097L
                  ,IP_65504_P_2097_L_LEN
                 );
            localIp65504P2097LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2097LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2097L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2097L() {	 
			return (getShort(beginIp65504P2097L));
   	}
         int localIp65504P2098SCounter = -1;
         public boolean isIp65504P2098SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2098SCounter != sharedCounter;
            localIp65504P2098SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2098_S_LEN = 2;
  	/**
	 * serializeIp65504P2098S
	 */
	protected void serializeIp65504P2098S(short ip65504P2098S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2098S,IP_65504_P_2098_S_LEN)
                  ,beginIp65504P2098S
                  ,IP_65504_P_2098_S_LEN
                 );
            localIp65504P2098SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2098SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2098S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2098S() {	 
			return (getShort(beginIp65504P2098S));
   	}
         int localIp65504P2098LCounter = -1;
         public boolean isIp65504P2098LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2098LCounter != sharedCounter;
            localIp65504P2098LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2098_L_LEN = 2;
  	/**
	 * serializeIp65504P2098L
	 */
	protected void serializeIp65504P2098L(short ip65504P2098L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2098L,IP_65504_P_2098_L_LEN)
                  ,beginIp65504P2098L
                  ,IP_65504_P_2098_L_LEN
                 );
            localIp65504P2098LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2098LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2098L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2098L() {	 
			return (getShort(beginIp65504P2098L));
   	}
         int localIp65504P2099SCounter = -1;
         public boolean isIp65504P2099SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2099SCounter != sharedCounter;
            localIp65504P2099SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2099_S_LEN = 2;
  	/**
	 * serializeIp65504P2099S
	 */
	protected void serializeIp65504P2099S(short ip65504P2099S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2099S,IP_65504_P_2099_S_LEN)
                  ,beginIp65504P2099S
                  ,IP_65504_P_2099_S_LEN
                 );
            localIp65504P2099SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2099SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2099S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2099S() {	 
			return (getShort(beginIp65504P2099S));
   	}
         int localIp65504P2099LCounter = -1;
         public boolean isIp65504P2099LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2099LCounter != sharedCounter;
            localIp65504P2099LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2099_L_LEN = 2;
  	/**
	 * serializeIp65504P2099L
	 */
	protected void serializeIp65504P2099L(short ip65504P2099L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2099L,IP_65504_P_2099_L_LEN)
                  ,beginIp65504P2099L
                  ,IP_65504_P_2099_L_LEN
                 );
            localIp65504P2099LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2099LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2099L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2099L() {	 
			return (getShort(beginIp65504P2099L));
   	}
         int localIp65504P2100SCounter = -1;
         public boolean isIp65504P2100SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2100SCounter != sharedCounter;
            localIp65504P2100SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2100_S_LEN = 2;
  	/**
	 * serializeIp65504P2100S
	 */
	protected void serializeIp65504P2100S(short ip65504P2100S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2100S,IP_65504_P_2100_S_LEN)
                  ,beginIp65504P2100S
                  ,IP_65504_P_2100_S_LEN
                 );
            localIp65504P2100SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2100SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2100S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2100S() {	 
			return (getShort(beginIp65504P2100S));
   	}
         int localIp65504P2100LCounter = -1;
         public boolean isIp65504P2100LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2100LCounter != sharedCounter;
            localIp65504P2100LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2100_L_LEN = 2;
  	/**
	 * serializeIp65504P2100L
	 */
	protected void serializeIp65504P2100L(short ip65504P2100L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2100L,IP_65504_P_2100_L_LEN)
                  ,beginIp65504P2100L
                  ,IP_65504_P_2100_L_LEN
                 );
            localIp65504P2100LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2100LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2100L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2100L() {	 
			return (getShort(beginIp65504P2100L));
   	}
         int localIp65504P2101SCounter = -1;
         public boolean isIp65504P2101SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2101SCounter != sharedCounter;
            localIp65504P2101SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2101_S_LEN = 2;
  	/**
	 * serializeIp65504P2101S
	 */
	protected void serializeIp65504P2101S(short ip65504P2101S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2101S,IP_65504_P_2101_S_LEN)
                  ,beginIp65504P2101S
                  ,IP_65504_P_2101_S_LEN
                 );
            localIp65504P2101SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2101SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2101S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2101S() {	 
			return (getShort(beginIp65504P2101S));
   	}
         int localIp65504P2101LCounter = -1;
         public boolean isIp65504P2101LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2101LCounter != sharedCounter;
            localIp65504P2101LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2101_L_LEN = 2;
  	/**
	 * serializeIp65504P2101L
	 */
	protected void serializeIp65504P2101L(short ip65504P2101L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2101L,IP_65504_P_2101_L_LEN)
                  ,beginIp65504P2101L
                  ,IP_65504_P_2101_L_LEN
                 );
            localIp65504P2101LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2101LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2101L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2101L() {	 
			return (getShort(beginIp65504P2101L));
   	}
         int localIp65504P2102SCounter = -1;
         public boolean isIp65504P2102SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2102SCounter != sharedCounter;
            localIp65504P2102SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2102_S_LEN = 2;
  	/**
	 * serializeIp65504P2102S
	 */
	protected void serializeIp65504P2102S(short ip65504P2102S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2102S,IP_65504_P_2102_S_LEN)
                  ,beginIp65504P2102S
                  ,IP_65504_P_2102_S_LEN
                 );
            localIp65504P2102SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2102SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2102S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2102S() {	 
			return (getShort(beginIp65504P2102S));
   	}
         int localIp65504P2102LCounter = -1;
         public boolean isIp65504P2102LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2102LCounter != sharedCounter;
            localIp65504P2102LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2102_L_LEN = 2;
  	/**
	 * serializeIp65504P2102L
	 */
	protected void serializeIp65504P2102L(short ip65504P2102L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2102L,IP_65504_P_2102_L_LEN)
                  ,beginIp65504P2102L
                  ,IP_65504_P_2102_L_LEN
                 );
            localIp65504P2102LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2102LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2102L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2102L() {	 
			return (getShort(beginIp65504P2102L));
   	}
         int localIp65504P2103SCounter = -1;
         public boolean isIp65504P2103SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2103SCounter != sharedCounter;
            localIp65504P2103SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2103_S_LEN = 2;
  	/**
	 * serializeIp65504P2103S
	 */
	protected void serializeIp65504P2103S(short ip65504P2103S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2103S,IP_65504_P_2103_S_LEN)
                  ,beginIp65504P2103S
                  ,IP_65504_P_2103_S_LEN
                 );
            localIp65504P2103SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2103SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2103S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2103S() {	 
			return (getShort(beginIp65504P2103S));
   	}
         int localIp65504P2103LCounter = -1;
         public boolean isIp65504P2103LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2103LCounter != sharedCounter;
            localIp65504P2103LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2103_L_LEN = 2;
  	/**
	 * serializeIp65504P2103L
	 */
	protected void serializeIp65504P2103L(short ip65504P2103L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2103L,IP_65504_P_2103_L_LEN)
                  ,beginIp65504P2103L
                  ,IP_65504_P_2103_L_LEN
                 );
            localIp65504P2103LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2103LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2103L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2103L() {	 
			return (getShort(beginIp65504P2103L));
   	}
         int localIp65504P2104SCounter = -1;
         public boolean isIp65504P2104SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2104SCounter != sharedCounter;
            localIp65504P2104SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2104_S_LEN = 2;
  	/**
	 * serializeIp65504P2104S
	 */
	protected void serializeIp65504P2104S(short ip65504P2104S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2104S,IP_65504_P_2104_S_LEN)
                  ,beginIp65504P2104S
                  ,IP_65504_P_2104_S_LEN
                 );
            localIp65504P2104SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2104SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2104S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2104S() {	 
			return (getShort(beginIp65504P2104S));
   	}
         int localIp65504P2104LCounter = -1;
         public boolean isIp65504P2104LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2104LCounter != sharedCounter;
            localIp65504P2104LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2104_L_LEN = 2;
  	/**
	 * serializeIp65504P2104L
	 */
	protected void serializeIp65504P2104L(short ip65504P2104L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2104L,IP_65504_P_2104_L_LEN)
                  ,beginIp65504P2104L
                  ,IP_65504_P_2104_L_LEN
                 );
            localIp65504P2104LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2104LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2104L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2104L() {	 
			return (getShort(beginIp65504P2104L));
   	}
         int localIp65504P2105SCounter = -1;
         public boolean isIp65504P2105SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2105SCounter != sharedCounter;
            localIp65504P2105SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2105_S_LEN = 2;
  	/**
	 * serializeIp65504P2105S
	 */
	protected void serializeIp65504P2105S(short ip65504P2105S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2105S,IP_65504_P_2105_S_LEN)
                  ,beginIp65504P2105S
                  ,IP_65504_P_2105_S_LEN
                 );
            localIp65504P2105SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2105SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2105S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2105S() {	 
			return (getShort(beginIp65504P2105S));
   	}
         int localIp65504P2105LCounter = -1;
         public boolean isIp65504P2105LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2105LCounter != sharedCounter;
            localIp65504P2105LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2105_L_LEN = 2;
  	/**
	 * serializeIp65504P2105L
	 */
	protected void serializeIp65504P2105L(short ip65504P2105L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2105L,IP_65504_P_2105_L_LEN)
                  ,beginIp65504P2105L
                  ,IP_65504_P_2105_L_LEN
                 );
            localIp65504P2105LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2105LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2105L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2105L() {	 
			return (getShort(beginIp65504P2105L));
   	}
         int localIp65504P2106SCounter = -1;
         public boolean isIp65504P2106SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2106SCounter != sharedCounter;
            localIp65504P2106SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2106_S_LEN = 2;
  	/**
	 * serializeIp65504P2106S
	 */
	protected void serializeIp65504P2106S(short ip65504P2106S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2106S,IP_65504_P_2106_S_LEN)
                  ,beginIp65504P2106S
                  ,IP_65504_P_2106_S_LEN
                 );
            localIp65504P2106SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2106SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2106S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2106S() {	 
			return (getShort(beginIp65504P2106S));
   	}
         int localIp65504P2106LCounter = -1;
         public boolean isIp65504P2106LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2106LCounter != sharedCounter;
            localIp65504P2106LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2106_L_LEN = 2;
  	/**
	 * serializeIp65504P2106L
	 */
	protected void serializeIp65504P2106L(short ip65504P2106L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2106L,IP_65504_P_2106_L_LEN)
                  ,beginIp65504P2106L
                  ,IP_65504_P_2106_L_LEN
                 );
            localIp65504P2106LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2106LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2106L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2106L() {	 
			return (getShort(beginIp65504P2106L));
   	}
         int localIp65504P2107SCounter = -1;
         public boolean isIp65504P2107SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2107SCounter != sharedCounter;
            localIp65504P2107SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2107_S_LEN = 2;
  	/**
	 * serializeIp65504P2107S
	 */
	protected void serializeIp65504P2107S(short ip65504P2107S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2107S,IP_65504_P_2107_S_LEN)
                  ,beginIp65504P2107S
                  ,IP_65504_P_2107_S_LEN
                 );
            localIp65504P2107SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2107SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2107S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2107S() {	 
			return (getShort(beginIp65504P2107S));
   	}
         int localIp65504P2107LCounter = -1;
         public boolean isIp65504P2107LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2107LCounter != sharedCounter;
            localIp65504P2107LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2107_L_LEN = 2;
  	/**
	 * serializeIp65504P2107L
	 */
	protected void serializeIp65504P2107L(short ip65504P2107L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2107L,IP_65504_P_2107_L_LEN)
                  ,beginIp65504P2107L
                  ,IP_65504_P_2107_L_LEN
                 );
            localIp65504P2107LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2107LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2107L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2107L() {	 
			return (getShort(beginIp65504P2107L));
   	}
         int localIp65504P2108SCounter = -1;
         public boolean isIp65504P2108SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2108SCounter != sharedCounter;
            localIp65504P2108SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2108_S_LEN = 2;
  	/**
	 * serializeIp65504P2108S
	 */
	protected void serializeIp65504P2108S(short ip65504P2108S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2108S,IP_65504_P_2108_S_LEN)
                  ,beginIp65504P2108S
                  ,IP_65504_P_2108_S_LEN
                 );
            localIp65504P2108SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2108SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2108S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2108S() {	 
			return (getShort(beginIp65504P2108S));
   	}
         int localIp65504P2108LCounter = -1;
         public boolean isIp65504P2108LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2108LCounter != sharedCounter;
            localIp65504P2108LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2108_L_LEN = 2;
  	/**
	 * serializeIp65504P2108L
	 */
	protected void serializeIp65504P2108L(short ip65504P2108L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2108L,IP_65504_P_2108_L_LEN)
                  ,beginIp65504P2108L
                  ,IP_65504_P_2108_L_LEN
                 );
            localIp65504P2108LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2108LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2108L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2108L() {	 
			return (getShort(beginIp65504P2108L));
   	}




}
  
