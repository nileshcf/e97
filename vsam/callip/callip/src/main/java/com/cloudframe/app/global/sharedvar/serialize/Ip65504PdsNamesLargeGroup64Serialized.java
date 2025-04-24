package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup64Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup64Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup64Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_64_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1954S;
            protected  int beginIp65504P1954L;
            protected  int beginIp65504P1955S;
            protected  int beginIp65504P1955L;
            protected  int beginIp65504P1956S;
            protected  int beginIp65504P1956L;
            protected  int beginIp65504P1957S;
            protected  int beginIp65504P1957L;
            protected  int beginIp65504P1958S;
            protected  int beginIp65504P1958L;
            protected  int beginIp65504P1959S;
            protected  int beginIp65504P1959L;
            protected  int beginIp65504P1960S;
            protected  int beginIp65504P1960L;
            protected  int beginIp65504P1961S;
            protected  int beginIp65504P1961L;
            protected  int beginIp65504P1962S;
            protected  int beginIp65504P1962L;
            protected  int beginIp65504P1963S;
            protected  int beginIp65504P1963L;
            protected  int beginIp65504P1964S;
            protected  int beginIp65504P1964L;
            protected  int beginIp65504P1965S;
            protected  int beginIp65504P1965L;
            protected  int beginIp65504P1966S;
            protected  int beginIp65504P1966L;
            protected  int beginIp65504P1967S;
            protected  int beginIp65504P1967L;
            protected  int beginIp65504P1968S;
            protected  int beginIp65504P1968L;
            protected  int beginIp65504P1969S;
            protected  int beginIp65504P1969L;
            protected  int beginIp65504P1970S;
            protected  int beginIp65504P1970L;
            protected  int beginIp65504P1971S;
            protected  int beginIp65504P1971L;
            protected  int beginIp65504P1972S;
            protected  int beginIp65504P1972L;
            protected  int beginIp65504P1973S;
            protected  int beginIp65504P1973L;
            protected  int beginIp65504P1974S;
            protected  int beginIp65504P1974L;
            protected  int beginIp65504P1975S;
            protected  int beginIp65504P1975L;
            protected  int beginIp65504P1976S;
            protected  int beginIp65504P1976L;
            protected  int beginIp65504P1977S;
            protected  int beginIp65504P1977L;
            protected  int beginIp65504P1978S;
            protected  int beginIp65504P1978L;
            protected  int beginIp65504P1979S;
            protected  int beginIp65504P1979L;
            protected  int beginIp65504P1980S;
            protected  int beginIp65504P1980L;
            protected  int beginIp65504P1981S;
            protected  int beginIp65504P1981L;
            protected  int beginIp65504P1982S;
            protected  int beginIp65504P1982L;
            protected  int beginIp65504P1983S;
            protected  int beginIp65504P1983L;
            protected  int beginIp65504P1984S;
            protected  int beginIp65504P1984L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup64Serialized
	**/
    public Ip65504PdsNamesLargeGroup64Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup64Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup64Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup64Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15620); // serialize this field at offset 15620 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup64Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15620 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup64Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_64_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1954S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1954L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1955S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1955L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1956S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1956L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1957S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1957L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1958S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1958L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1959S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1959L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1960S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1960L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1961S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1961L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1962S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1962L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1963S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1963L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1964S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1964L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1965S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1965L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1966S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1966L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1967S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1967L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1968S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1968L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1969S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1969L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1970S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1970L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1971S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1971L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1972S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1972L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1973S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1973L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1974S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1974L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1975S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1975L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1976S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1976L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1977S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1977L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1978S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1978L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1979S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1979L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1980S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1980L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1981S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1981L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1982S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1982L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1983S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1983L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1984S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1984L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1954SCounter = -1;
         public boolean isIp65504P1954SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1954SCounter != sharedCounter;
            localIp65504P1954SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1954_S_LEN = 2;
  	/**
	 * serializeIp65504P1954S
	 */
	protected void serializeIp65504P1954S(short ip65504P1954S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1954S,IP_65504_P_1954_S_LEN)
                  ,beginIp65504P1954S
                  ,IP_65504_P_1954_S_LEN
                 );
            localIp65504P1954SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1954SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1954S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1954S() {	 
			return (getShort(beginIp65504P1954S));
   	}
         int localIp65504P1954LCounter = -1;
         public boolean isIp65504P1954LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1954LCounter != sharedCounter;
            localIp65504P1954LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1954_L_LEN = 2;
  	/**
	 * serializeIp65504P1954L
	 */
	protected void serializeIp65504P1954L(short ip65504P1954L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1954L,IP_65504_P_1954_L_LEN)
                  ,beginIp65504P1954L
                  ,IP_65504_P_1954_L_LEN
                 );
            localIp65504P1954LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1954LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1954L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1954L() {	 
			return (getShort(beginIp65504P1954L));
   	}
         int localIp65504P1955SCounter = -1;
         public boolean isIp65504P1955SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1955SCounter != sharedCounter;
            localIp65504P1955SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1955_S_LEN = 2;
  	/**
	 * serializeIp65504P1955S
	 */
	protected void serializeIp65504P1955S(short ip65504P1955S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1955S,IP_65504_P_1955_S_LEN)
                  ,beginIp65504P1955S
                  ,IP_65504_P_1955_S_LEN
                 );
            localIp65504P1955SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1955SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1955S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1955S() {	 
			return (getShort(beginIp65504P1955S));
   	}
         int localIp65504P1955LCounter = -1;
         public boolean isIp65504P1955LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1955LCounter != sharedCounter;
            localIp65504P1955LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1955_L_LEN = 2;
  	/**
	 * serializeIp65504P1955L
	 */
	protected void serializeIp65504P1955L(short ip65504P1955L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1955L,IP_65504_P_1955_L_LEN)
                  ,beginIp65504P1955L
                  ,IP_65504_P_1955_L_LEN
                 );
            localIp65504P1955LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1955LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1955L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1955L() {	 
			return (getShort(beginIp65504P1955L));
   	}
         int localIp65504P1956SCounter = -1;
         public boolean isIp65504P1956SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1956SCounter != sharedCounter;
            localIp65504P1956SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1956_S_LEN = 2;
  	/**
	 * serializeIp65504P1956S
	 */
	protected void serializeIp65504P1956S(short ip65504P1956S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1956S,IP_65504_P_1956_S_LEN)
                  ,beginIp65504P1956S
                  ,IP_65504_P_1956_S_LEN
                 );
            localIp65504P1956SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1956SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1956S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1956S() {	 
			return (getShort(beginIp65504P1956S));
   	}
         int localIp65504P1956LCounter = -1;
         public boolean isIp65504P1956LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1956LCounter != sharedCounter;
            localIp65504P1956LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1956_L_LEN = 2;
  	/**
	 * serializeIp65504P1956L
	 */
	protected void serializeIp65504P1956L(short ip65504P1956L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1956L,IP_65504_P_1956_L_LEN)
                  ,beginIp65504P1956L
                  ,IP_65504_P_1956_L_LEN
                 );
            localIp65504P1956LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1956LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1956L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1956L() {	 
			return (getShort(beginIp65504P1956L));
   	}
         int localIp65504P1957SCounter = -1;
         public boolean isIp65504P1957SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1957SCounter != sharedCounter;
            localIp65504P1957SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1957_S_LEN = 2;
  	/**
	 * serializeIp65504P1957S
	 */
	protected void serializeIp65504P1957S(short ip65504P1957S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1957S,IP_65504_P_1957_S_LEN)
                  ,beginIp65504P1957S
                  ,IP_65504_P_1957_S_LEN
                 );
            localIp65504P1957SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1957SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1957S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1957S() {	 
			return (getShort(beginIp65504P1957S));
   	}
         int localIp65504P1957LCounter = -1;
         public boolean isIp65504P1957LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1957LCounter != sharedCounter;
            localIp65504P1957LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1957_L_LEN = 2;
  	/**
	 * serializeIp65504P1957L
	 */
	protected void serializeIp65504P1957L(short ip65504P1957L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1957L,IP_65504_P_1957_L_LEN)
                  ,beginIp65504P1957L
                  ,IP_65504_P_1957_L_LEN
                 );
            localIp65504P1957LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1957LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1957L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1957L() {	 
			return (getShort(beginIp65504P1957L));
   	}
         int localIp65504P1958SCounter = -1;
         public boolean isIp65504P1958SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1958SCounter != sharedCounter;
            localIp65504P1958SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1958_S_LEN = 2;
  	/**
	 * serializeIp65504P1958S
	 */
	protected void serializeIp65504P1958S(short ip65504P1958S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1958S,IP_65504_P_1958_S_LEN)
                  ,beginIp65504P1958S
                  ,IP_65504_P_1958_S_LEN
                 );
            localIp65504P1958SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1958SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1958S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1958S() {	 
			return (getShort(beginIp65504P1958S));
   	}
         int localIp65504P1958LCounter = -1;
         public boolean isIp65504P1958LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1958LCounter != sharedCounter;
            localIp65504P1958LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1958_L_LEN = 2;
  	/**
	 * serializeIp65504P1958L
	 */
	protected void serializeIp65504P1958L(short ip65504P1958L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1958L,IP_65504_P_1958_L_LEN)
                  ,beginIp65504P1958L
                  ,IP_65504_P_1958_L_LEN
                 );
            localIp65504P1958LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1958LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1958L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1958L() {	 
			return (getShort(beginIp65504P1958L));
   	}
         int localIp65504P1959SCounter = -1;
         public boolean isIp65504P1959SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1959SCounter != sharedCounter;
            localIp65504P1959SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1959_S_LEN = 2;
  	/**
	 * serializeIp65504P1959S
	 */
	protected void serializeIp65504P1959S(short ip65504P1959S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1959S,IP_65504_P_1959_S_LEN)
                  ,beginIp65504P1959S
                  ,IP_65504_P_1959_S_LEN
                 );
            localIp65504P1959SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1959SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1959S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1959S() {	 
			return (getShort(beginIp65504P1959S));
   	}
         int localIp65504P1959LCounter = -1;
         public boolean isIp65504P1959LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1959LCounter != sharedCounter;
            localIp65504P1959LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1959_L_LEN = 2;
  	/**
	 * serializeIp65504P1959L
	 */
	protected void serializeIp65504P1959L(short ip65504P1959L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1959L,IP_65504_P_1959_L_LEN)
                  ,beginIp65504P1959L
                  ,IP_65504_P_1959_L_LEN
                 );
            localIp65504P1959LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1959LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1959L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1959L() {	 
			return (getShort(beginIp65504P1959L));
   	}
         int localIp65504P1960SCounter = -1;
         public boolean isIp65504P1960SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1960SCounter != sharedCounter;
            localIp65504P1960SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1960_S_LEN = 2;
  	/**
	 * serializeIp65504P1960S
	 */
	protected void serializeIp65504P1960S(short ip65504P1960S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1960S,IP_65504_P_1960_S_LEN)
                  ,beginIp65504P1960S
                  ,IP_65504_P_1960_S_LEN
                 );
            localIp65504P1960SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1960SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1960S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1960S() {	 
			return (getShort(beginIp65504P1960S));
   	}
         int localIp65504P1960LCounter = -1;
         public boolean isIp65504P1960LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1960LCounter != sharedCounter;
            localIp65504P1960LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1960_L_LEN = 2;
  	/**
	 * serializeIp65504P1960L
	 */
	protected void serializeIp65504P1960L(short ip65504P1960L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1960L,IP_65504_P_1960_L_LEN)
                  ,beginIp65504P1960L
                  ,IP_65504_P_1960_L_LEN
                 );
            localIp65504P1960LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1960LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1960L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1960L() {	 
			return (getShort(beginIp65504P1960L));
   	}
         int localIp65504P1961SCounter = -1;
         public boolean isIp65504P1961SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1961SCounter != sharedCounter;
            localIp65504P1961SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1961_S_LEN = 2;
  	/**
	 * serializeIp65504P1961S
	 */
	protected void serializeIp65504P1961S(short ip65504P1961S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1961S,IP_65504_P_1961_S_LEN)
                  ,beginIp65504P1961S
                  ,IP_65504_P_1961_S_LEN
                 );
            localIp65504P1961SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1961SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1961S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1961S() {	 
			return (getShort(beginIp65504P1961S));
   	}
         int localIp65504P1961LCounter = -1;
         public boolean isIp65504P1961LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1961LCounter != sharedCounter;
            localIp65504P1961LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1961_L_LEN = 2;
  	/**
	 * serializeIp65504P1961L
	 */
	protected void serializeIp65504P1961L(short ip65504P1961L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1961L,IP_65504_P_1961_L_LEN)
                  ,beginIp65504P1961L
                  ,IP_65504_P_1961_L_LEN
                 );
            localIp65504P1961LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1961LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1961L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1961L() {	 
			return (getShort(beginIp65504P1961L));
   	}
         int localIp65504P1962SCounter = -1;
         public boolean isIp65504P1962SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1962SCounter != sharedCounter;
            localIp65504P1962SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1962_S_LEN = 2;
  	/**
	 * serializeIp65504P1962S
	 */
	protected void serializeIp65504P1962S(short ip65504P1962S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1962S,IP_65504_P_1962_S_LEN)
                  ,beginIp65504P1962S
                  ,IP_65504_P_1962_S_LEN
                 );
            localIp65504P1962SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1962SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1962S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1962S() {	 
			return (getShort(beginIp65504P1962S));
   	}
         int localIp65504P1962LCounter = -1;
         public boolean isIp65504P1962LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1962LCounter != sharedCounter;
            localIp65504P1962LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1962_L_LEN = 2;
  	/**
	 * serializeIp65504P1962L
	 */
	protected void serializeIp65504P1962L(short ip65504P1962L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1962L,IP_65504_P_1962_L_LEN)
                  ,beginIp65504P1962L
                  ,IP_65504_P_1962_L_LEN
                 );
            localIp65504P1962LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1962LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1962L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1962L() {	 
			return (getShort(beginIp65504P1962L));
   	}
         int localIp65504P1963SCounter = -1;
         public boolean isIp65504P1963SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1963SCounter != sharedCounter;
            localIp65504P1963SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1963_S_LEN = 2;
  	/**
	 * serializeIp65504P1963S
	 */
	protected void serializeIp65504P1963S(short ip65504P1963S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1963S,IP_65504_P_1963_S_LEN)
                  ,beginIp65504P1963S
                  ,IP_65504_P_1963_S_LEN
                 );
            localIp65504P1963SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1963SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1963S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1963S() {	 
			return (getShort(beginIp65504P1963S));
   	}
         int localIp65504P1963LCounter = -1;
         public boolean isIp65504P1963LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1963LCounter != sharedCounter;
            localIp65504P1963LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1963_L_LEN = 2;
  	/**
	 * serializeIp65504P1963L
	 */
	protected void serializeIp65504P1963L(short ip65504P1963L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1963L,IP_65504_P_1963_L_LEN)
                  ,beginIp65504P1963L
                  ,IP_65504_P_1963_L_LEN
                 );
            localIp65504P1963LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1963LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1963L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1963L() {	 
			return (getShort(beginIp65504P1963L));
   	}
         int localIp65504P1964SCounter = -1;
         public boolean isIp65504P1964SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1964SCounter != sharedCounter;
            localIp65504P1964SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1964_S_LEN = 2;
  	/**
	 * serializeIp65504P1964S
	 */
	protected void serializeIp65504P1964S(short ip65504P1964S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1964S,IP_65504_P_1964_S_LEN)
                  ,beginIp65504P1964S
                  ,IP_65504_P_1964_S_LEN
                 );
            localIp65504P1964SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1964SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1964S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1964S() {	 
			return (getShort(beginIp65504P1964S));
   	}
         int localIp65504P1964LCounter = -1;
         public boolean isIp65504P1964LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1964LCounter != sharedCounter;
            localIp65504P1964LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1964_L_LEN = 2;
  	/**
	 * serializeIp65504P1964L
	 */
	protected void serializeIp65504P1964L(short ip65504P1964L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1964L,IP_65504_P_1964_L_LEN)
                  ,beginIp65504P1964L
                  ,IP_65504_P_1964_L_LEN
                 );
            localIp65504P1964LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1964LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1964L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1964L() {	 
			return (getShort(beginIp65504P1964L));
   	}
         int localIp65504P1965SCounter = -1;
         public boolean isIp65504P1965SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1965SCounter != sharedCounter;
            localIp65504P1965SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1965_S_LEN = 2;
  	/**
	 * serializeIp65504P1965S
	 */
	protected void serializeIp65504P1965S(short ip65504P1965S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1965S,IP_65504_P_1965_S_LEN)
                  ,beginIp65504P1965S
                  ,IP_65504_P_1965_S_LEN
                 );
            localIp65504P1965SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1965SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1965S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1965S() {	 
			return (getShort(beginIp65504P1965S));
   	}
         int localIp65504P1965LCounter = -1;
         public boolean isIp65504P1965LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1965LCounter != sharedCounter;
            localIp65504P1965LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1965_L_LEN = 2;
  	/**
	 * serializeIp65504P1965L
	 */
	protected void serializeIp65504P1965L(short ip65504P1965L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1965L,IP_65504_P_1965_L_LEN)
                  ,beginIp65504P1965L
                  ,IP_65504_P_1965_L_LEN
                 );
            localIp65504P1965LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1965LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1965L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1965L() {	 
			return (getShort(beginIp65504P1965L));
   	}
         int localIp65504P1966SCounter = -1;
         public boolean isIp65504P1966SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1966SCounter != sharedCounter;
            localIp65504P1966SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1966_S_LEN = 2;
  	/**
	 * serializeIp65504P1966S
	 */
	protected void serializeIp65504P1966S(short ip65504P1966S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1966S,IP_65504_P_1966_S_LEN)
                  ,beginIp65504P1966S
                  ,IP_65504_P_1966_S_LEN
                 );
            localIp65504P1966SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1966SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1966S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1966S() {	 
			return (getShort(beginIp65504P1966S));
   	}
         int localIp65504P1966LCounter = -1;
         public boolean isIp65504P1966LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1966LCounter != sharedCounter;
            localIp65504P1966LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1966_L_LEN = 2;
  	/**
	 * serializeIp65504P1966L
	 */
	protected void serializeIp65504P1966L(short ip65504P1966L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1966L,IP_65504_P_1966_L_LEN)
                  ,beginIp65504P1966L
                  ,IP_65504_P_1966_L_LEN
                 );
            localIp65504P1966LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1966LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1966L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1966L() {	 
			return (getShort(beginIp65504P1966L));
   	}
         int localIp65504P1967SCounter = -1;
         public boolean isIp65504P1967SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1967SCounter != sharedCounter;
            localIp65504P1967SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1967_S_LEN = 2;
  	/**
	 * serializeIp65504P1967S
	 */
	protected void serializeIp65504P1967S(short ip65504P1967S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1967S,IP_65504_P_1967_S_LEN)
                  ,beginIp65504P1967S
                  ,IP_65504_P_1967_S_LEN
                 );
            localIp65504P1967SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1967SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1967S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1967S() {	 
			return (getShort(beginIp65504P1967S));
   	}
         int localIp65504P1967LCounter = -1;
         public boolean isIp65504P1967LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1967LCounter != sharedCounter;
            localIp65504P1967LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1967_L_LEN = 2;
  	/**
	 * serializeIp65504P1967L
	 */
	protected void serializeIp65504P1967L(short ip65504P1967L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1967L,IP_65504_P_1967_L_LEN)
                  ,beginIp65504P1967L
                  ,IP_65504_P_1967_L_LEN
                 );
            localIp65504P1967LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1967LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1967L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1967L() {	 
			return (getShort(beginIp65504P1967L));
   	}
         int localIp65504P1968SCounter = -1;
         public boolean isIp65504P1968SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1968SCounter != sharedCounter;
            localIp65504P1968SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1968_S_LEN = 2;
  	/**
	 * serializeIp65504P1968S
	 */
	protected void serializeIp65504P1968S(short ip65504P1968S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1968S,IP_65504_P_1968_S_LEN)
                  ,beginIp65504P1968S
                  ,IP_65504_P_1968_S_LEN
                 );
            localIp65504P1968SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1968SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1968S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1968S() {	 
			return (getShort(beginIp65504P1968S));
   	}
         int localIp65504P1968LCounter = -1;
         public boolean isIp65504P1968LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1968LCounter != sharedCounter;
            localIp65504P1968LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1968_L_LEN = 2;
  	/**
	 * serializeIp65504P1968L
	 */
	protected void serializeIp65504P1968L(short ip65504P1968L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1968L,IP_65504_P_1968_L_LEN)
                  ,beginIp65504P1968L
                  ,IP_65504_P_1968_L_LEN
                 );
            localIp65504P1968LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1968LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1968L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1968L() {	 
			return (getShort(beginIp65504P1968L));
   	}
         int localIp65504P1969SCounter = -1;
         public boolean isIp65504P1969SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1969SCounter != sharedCounter;
            localIp65504P1969SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1969_S_LEN = 2;
  	/**
	 * serializeIp65504P1969S
	 */
	protected void serializeIp65504P1969S(short ip65504P1969S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1969S,IP_65504_P_1969_S_LEN)
                  ,beginIp65504P1969S
                  ,IP_65504_P_1969_S_LEN
                 );
            localIp65504P1969SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1969SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1969S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1969S() {	 
			return (getShort(beginIp65504P1969S));
   	}
         int localIp65504P1969LCounter = -1;
         public boolean isIp65504P1969LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1969LCounter != sharedCounter;
            localIp65504P1969LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1969_L_LEN = 2;
  	/**
	 * serializeIp65504P1969L
	 */
	protected void serializeIp65504P1969L(short ip65504P1969L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1969L,IP_65504_P_1969_L_LEN)
                  ,beginIp65504P1969L
                  ,IP_65504_P_1969_L_LEN
                 );
            localIp65504P1969LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1969LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1969L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1969L() {	 
			return (getShort(beginIp65504P1969L));
   	}
         int localIp65504P1970SCounter = -1;
         public boolean isIp65504P1970SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1970SCounter != sharedCounter;
            localIp65504P1970SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1970_S_LEN = 2;
  	/**
	 * serializeIp65504P1970S
	 */
	protected void serializeIp65504P1970S(short ip65504P1970S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1970S,IP_65504_P_1970_S_LEN)
                  ,beginIp65504P1970S
                  ,IP_65504_P_1970_S_LEN
                 );
            localIp65504P1970SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1970SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1970S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1970S() {	 
			return (getShort(beginIp65504P1970S));
   	}
         int localIp65504P1970LCounter = -1;
         public boolean isIp65504P1970LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1970LCounter != sharedCounter;
            localIp65504P1970LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1970_L_LEN = 2;
  	/**
	 * serializeIp65504P1970L
	 */
	protected void serializeIp65504P1970L(short ip65504P1970L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1970L,IP_65504_P_1970_L_LEN)
                  ,beginIp65504P1970L
                  ,IP_65504_P_1970_L_LEN
                 );
            localIp65504P1970LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1970LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1970L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1970L() {	 
			return (getShort(beginIp65504P1970L));
   	}
         int localIp65504P1971SCounter = -1;
         public boolean isIp65504P1971SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1971SCounter != sharedCounter;
            localIp65504P1971SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1971_S_LEN = 2;
  	/**
	 * serializeIp65504P1971S
	 */
	protected void serializeIp65504P1971S(short ip65504P1971S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1971S,IP_65504_P_1971_S_LEN)
                  ,beginIp65504P1971S
                  ,IP_65504_P_1971_S_LEN
                 );
            localIp65504P1971SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1971SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1971S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1971S() {	 
			return (getShort(beginIp65504P1971S));
   	}
         int localIp65504P1971LCounter = -1;
         public boolean isIp65504P1971LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1971LCounter != sharedCounter;
            localIp65504P1971LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1971_L_LEN = 2;
  	/**
	 * serializeIp65504P1971L
	 */
	protected void serializeIp65504P1971L(short ip65504P1971L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1971L,IP_65504_P_1971_L_LEN)
                  ,beginIp65504P1971L
                  ,IP_65504_P_1971_L_LEN
                 );
            localIp65504P1971LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1971LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1971L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1971L() {	 
			return (getShort(beginIp65504P1971L));
   	}
         int localIp65504P1972SCounter = -1;
         public boolean isIp65504P1972SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1972SCounter != sharedCounter;
            localIp65504P1972SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1972_S_LEN = 2;
  	/**
	 * serializeIp65504P1972S
	 */
	protected void serializeIp65504P1972S(short ip65504P1972S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1972S,IP_65504_P_1972_S_LEN)
                  ,beginIp65504P1972S
                  ,IP_65504_P_1972_S_LEN
                 );
            localIp65504P1972SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1972SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1972S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1972S() {	 
			return (getShort(beginIp65504P1972S));
   	}
         int localIp65504P1972LCounter = -1;
         public boolean isIp65504P1972LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1972LCounter != sharedCounter;
            localIp65504P1972LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1972_L_LEN = 2;
  	/**
	 * serializeIp65504P1972L
	 */
	protected void serializeIp65504P1972L(short ip65504P1972L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1972L,IP_65504_P_1972_L_LEN)
                  ,beginIp65504P1972L
                  ,IP_65504_P_1972_L_LEN
                 );
            localIp65504P1972LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1972LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1972L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1972L() {	 
			return (getShort(beginIp65504P1972L));
   	}
         int localIp65504P1973SCounter = -1;
         public boolean isIp65504P1973SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1973SCounter != sharedCounter;
            localIp65504P1973SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1973_S_LEN = 2;
  	/**
	 * serializeIp65504P1973S
	 */
	protected void serializeIp65504P1973S(short ip65504P1973S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1973S,IP_65504_P_1973_S_LEN)
                  ,beginIp65504P1973S
                  ,IP_65504_P_1973_S_LEN
                 );
            localIp65504P1973SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1973SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1973S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1973S() {	 
			return (getShort(beginIp65504P1973S));
   	}
         int localIp65504P1973LCounter = -1;
         public boolean isIp65504P1973LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1973LCounter != sharedCounter;
            localIp65504P1973LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1973_L_LEN = 2;
  	/**
	 * serializeIp65504P1973L
	 */
	protected void serializeIp65504P1973L(short ip65504P1973L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1973L,IP_65504_P_1973_L_LEN)
                  ,beginIp65504P1973L
                  ,IP_65504_P_1973_L_LEN
                 );
            localIp65504P1973LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1973LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1973L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1973L() {	 
			return (getShort(beginIp65504P1973L));
   	}
         int localIp65504P1974SCounter = -1;
         public boolean isIp65504P1974SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1974SCounter != sharedCounter;
            localIp65504P1974SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1974_S_LEN = 2;
  	/**
	 * serializeIp65504P1974S
	 */
	protected void serializeIp65504P1974S(short ip65504P1974S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1974S,IP_65504_P_1974_S_LEN)
                  ,beginIp65504P1974S
                  ,IP_65504_P_1974_S_LEN
                 );
            localIp65504P1974SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1974SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1974S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1974S() {	 
			return (getShort(beginIp65504P1974S));
   	}
         int localIp65504P1974LCounter = -1;
         public boolean isIp65504P1974LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1974LCounter != sharedCounter;
            localIp65504P1974LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1974_L_LEN = 2;
  	/**
	 * serializeIp65504P1974L
	 */
	protected void serializeIp65504P1974L(short ip65504P1974L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1974L,IP_65504_P_1974_L_LEN)
                  ,beginIp65504P1974L
                  ,IP_65504_P_1974_L_LEN
                 );
            localIp65504P1974LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1974LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1974L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1974L() {	 
			return (getShort(beginIp65504P1974L));
   	}
         int localIp65504P1975SCounter = -1;
         public boolean isIp65504P1975SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1975SCounter != sharedCounter;
            localIp65504P1975SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1975_S_LEN = 2;
  	/**
	 * serializeIp65504P1975S
	 */
	protected void serializeIp65504P1975S(short ip65504P1975S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1975S,IP_65504_P_1975_S_LEN)
                  ,beginIp65504P1975S
                  ,IP_65504_P_1975_S_LEN
                 );
            localIp65504P1975SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1975SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1975S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1975S() {	 
			return (getShort(beginIp65504P1975S));
   	}
         int localIp65504P1975LCounter = -1;
         public boolean isIp65504P1975LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1975LCounter != sharedCounter;
            localIp65504P1975LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1975_L_LEN = 2;
  	/**
	 * serializeIp65504P1975L
	 */
	protected void serializeIp65504P1975L(short ip65504P1975L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1975L,IP_65504_P_1975_L_LEN)
                  ,beginIp65504P1975L
                  ,IP_65504_P_1975_L_LEN
                 );
            localIp65504P1975LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1975LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1975L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1975L() {	 
			return (getShort(beginIp65504P1975L));
   	}
         int localIp65504P1976SCounter = -1;
         public boolean isIp65504P1976SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1976SCounter != sharedCounter;
            localIp65504P1976SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1976_S_LEN = 2;
  	/**
	 * serializeIp65504P1976S
	 */
	protected void serializeIp65504P1976S(short ip65504P1976S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1976S,IP_65504_P_1976_S_LEN)
                  ,beginIp65504P1976S
                  ,IP_65504_P_1976_S_LEN
                 );
            localIp65504P1976SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1976SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1976S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1976S() {	 
			return (getShort(beginIp65504P1976S));
   	}
         int localIp65504P1976LCounter = -1;
         public boolean isIp65504P1976LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1976LCounter != sharedCounter;
            localIp65504P1976LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1976_L_LEN = 2;
  	/**
	 * serializeIp65504P1976L
	 */
	protected void serializeIp65504P1976L(short ip65504P1976L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1976L,IP_65504_P_1976_L_LEN)
                  ,beginIp65504P1976L
                  ,IP_65504_P_1976_L_LEN
                 );
            localIp65504P1976LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1976LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1976L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1976L() {	 
			return (getShort(beginIp65504P1976L));
   	}
         int localIp65504P1977SCounter = -1;
         public boolean isIp65504P1977SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1977SCounter != sharedCounter;
            localIp65504P1977SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1977_S_LEN = 2;
  	/**
	 * serializeIp65504P1977S
	 */
	protected void serializeIp65504P1977S(short ip65504P1977S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1977S,IP_65504_P_1977_S_LEN)
                  ,beginIp65504P1977S
                  ,IP_65504_P_1977_S_LEN
                 );
            localIp65504P1977SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1977SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1977S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1977S() {	 
			return (getShort(beginIp65504P1977S));
   	}
         int localIp65504P1977LCounter = -1;
         public boolean isIp65504P1977LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1977LCounter != sharedCounter;
            localIp65504P1977LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1977_L_LEN = 2;
  	/**
	 * serializeIp65504P1977L
	 */
	protected void serializeIp65504P1977L(short ip65504P1977L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1977L,IP_65504_P_1977_L_LEN)
                  ,beginIp65504P1977L
                  ,IP_65504_P_1977_L_LEN
                 );
            localIp65504P1977LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1977LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1977L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1977L() {	 
			return (getShort(beginIp65504P1977L));
   	}
         int localIp65504P1978SCounter = -1;
         public boolean isIp65504P1978SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1978SCounter != sharedCounter;
            localIp65504P1978SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1978_S_LEN = 2;
  	/**
	 * serializeIp65504P1978S
	 */
	protected void serializeIp65504P1978S(short ip65504P1978S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1978S,IP_65504_P_1978_S_LEN)
                  ,beginIp65504P1978S
                  ,IP_65504_P_1978_S_LEN
                 );
            localIp65504P1978SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1978SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1978S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1978S() {	 
			return (getShort(beginIp65504P1978S));
   	}
         int localIp65504P1978LCounter = -1;
         public boolean isIp65504P1978LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1978LCounter != sharedCounter;
            localIp65504P1978LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1978_L_LEN = 2;
  	/**
	 * serializeIp65504P1978L
	 */
	protected void serializeIp65504P1978L(short ip65504P1978L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1978L,IP_65504_P_1978_L_LEN)
                  ,beginIp65504P1978L
                  ,IP_65504_P_1978_L_LEN
                 );
            localIp65504P1978LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1978LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1978L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1978L() {	 
			return (getShort(beginIp65504P1978L));
   	}
         int localIp65504P1979SCounter = -1;
         public boolean isIp65504P1979SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1979SCounter != sharedCounter;
            localIp65504P1979SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1979_S_LEN = 2;
  	/**
	 * serializeIp65504P1979S
	 */
	protected void serializeIp65504P1979S(short ip65504P1979S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1979S,IP_65504_P_1979_S_LEN)
                  ,beginIp65504P1979S
                  ,IP_65504_P_1979_S_LEN
                 );
            localIp65504P1979SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1979SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1979S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1979S() {	 
			return (getShort(beginIp65504P1979S));
   	}
         int localIp65504P1979LCounter = -1;
         public boolean isIp65504P1979LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1979LCounter != sharedCounter;
            localIp65504P1979LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1979_L_LEN = 2;
  	/**
	 * serializeIp65504P1979L
	 */
	protected void serializeIp65504P1979L(short ip65504P1979L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1979L,IP_65504_P_1979_L_LEN)
                  ,beginIp65504P1979L
                  ,IP_65504_P_1979_L_LEN
                 );
            localIp65504P1979LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1979LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1979L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1979L() {	 
			return (getShort(beginIp65504P1979L));
   	}
         int localIp65504P1980SCounter = -1;
         public boolean isIp65504P1980SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1980SCounter != sharedCounter;
            localIp65504P1980SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1980_S_LEN = 2;
  	/**
	 * serializeIp65504P1980S
	 */
	protected void serializeIp65504P1980S(short ip65504P1980S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1980S,IP_65504_P_1980_S_LEN)
                  ,beginIp65504P1980S
                  ,IP_65504_P_1980_S_LEN
                 );
            localIp65504P1980SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1980SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1980S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1980S() {	 
			return (getShort(beginIp65504P1980S));
   	}
         int localIp65504P1980LCounter = -1;
         public boolean isIp65504P1980LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1980LCounter != sharedCounter;
            localIp65504P1980LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1980_L_LEN = 2;
  	/**
	 * serializeIp65504P1980L
	 */
	protected void serializeIp65504P1980L(short ip65504P1980L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1980L,IP_65504_P_1980_L_LEN)
                  ,beginIp65504P1980L
                  ,IP_65504_P_1980_L_LEN
                 );
            localIp65504P1980LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1980LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1980L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1980L() {	 
			return (getShort(beginIp65504P1980L));
   	}
         int localIp65504P1981SCounter = -1;
         public boolean isIp65504P1981SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1981SCounter != sharedCounter;
            localIp65504P1981SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1981_S_LEN = 2;
  	/**
	 * serializeIp65504P1981S
	 */
	protected void serializeIp65504P1981S(short ip65504P1981S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1981S,IP_65504_P_1981_S_LEN)
                  ,beginIp65504P1981S
                  ,IP_65504_P_1981_S_LEN
                 );
            localIp65504P1981SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1981SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1981S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1981S() {	 
			return (getShort(beginIp65504P1981S));
   	}
         int localIp65504P1981LCounter = -1;
         public boolean isIp65504P1981LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1981LCounter != sharedCounter;
            localIp65504P1981LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1981_L_LEN = 2;
  	/**
	 * serializeIp65504P1981L
	 */
	protected void serializeIp65504P1981L(short ip65504P1981L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1981L,IP_65504_P_1981_L_LEN)
                  ,beginIp65504P1981L
                  ,IP_65504_P_1981_L_LEN
                 );
            localIp65504P1981LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1981LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1981L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1981L() {	 
			return (getShort(beginIp65504P1981L));
   	}
         int localIp65504P1982SCounter = -1;
         public boolean isIp65504P1982SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1982SCounter != sharedCounter;
            localIp65504P1982SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1982_S_LEN = 2;
  	/**
	 * serializeIp65504P1982S
	 */
	protected void serializeIp65504P1982S(short ip65504P1982S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1982S,IP_65504_P_1982_S_LEN)
                  ,beginIp65504P1982S
                  ,IP_65504_P_1982_S_LEN
                 );
            localIp65504P1982SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1982SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1982S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1982S() {	 
			return (getShort(beginIp65504P1982S));
   	}
         int localIp65504P1982LCounter = -1;
         public boolean isIp65504P1982LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1982LCounter != sharedCounter;
            localIp65504P1982LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1982_L_LEN = 2;
  	/**
	 * serializeIp65504P1982L
	 */
	protected void serializeIp65504P1982L(short ip65504P1982L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1982L,IP_65504_P_1982_L_LEN)
                  ,beginIp65504P1982L
                  ,IP_65504_P_1982_L_LEN
                 );
            localIp65504P1982LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1982LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1982L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1982L() {	 
			return (getShort(beginIp65504P1982L));
   	}
         int localIp65504P1983SCounter = -1;
         public boolean isIp65504P1983SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1983SCounter != sharedCounter;
            localIp65504P1983SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1983_S_LEN = 2;
  	/**
	 * serializeIp65504P1983S
	 */
	protected void serializeIp65504P1983S(short ip65504P1983S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1983S,IP_65504_P_1983_S_LEN)
                  ,beginIp65504P1983S
                  ,IP_65504_P_1983_S_LEN
                 );
            localIp65504P1983SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1983SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1983S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1983S() {	 
			return (getShort(beginIp65504P1983S));
   	}
         int localIp65504P1983LCounter = -1;
         public boolean isIp65504P1983LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1983LCounter != sharedCounter;
            localIp65504P1983LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1983_L_LEN = 2;
  	/**
	 * serializeIp65504P1983L
	 */
	protected void serializeIp65504P1983L(short ip65504P1983L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1983L,IP_65504_P_1983_L_LEN)
                  ,beginIp65504P1983L
                  ,IP_65504_P_1983_L_LEN
                 );
            localIp65504P1983LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1983LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1983L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1983L() {	 
			return (getShort(beginIp65504P1983L));
   	}
         int localIp65504P1984SCounter = -1;
         public boolean isIp65504P1984SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1984SCounter != sharedCounter;
            localIp65504P1984SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1984_S_LEN = 2;
  	/**
	 * serializeIp65504P1984S
	 */
	protected void serializeIp65504P1984S(short ip65504P1984S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1984S,IP_65504_P_1984_S_LEN)
                  ,beginIp65504P1984S
                  ,IP_65504_P_1984_S_LEN
                 );
            localIp65504P1984SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1984SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1984S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1984S() {	 
			return (getShort(beginIp65504P1984S));
   	}
         int localIp65504P1984LCounter = -1;
         public boolean isIp65504P1984LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1984LCounter != sharedCounter;
            localIp65504P1984LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1984_L_LEN = 2;
  	/**
	 * serializeIp65504P1984L
	 */
	protected void serializeIp65504P1984L(short ip65504P1984L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1984L,IP_65504_P_1984_L_LEN)
                  ,beginIp65504P1984L
                  ,IP_65504_P_1984_L_LEN
                 );
            localIp65504P1984LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1984LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1984L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1984L() {	 
			return (getShort(beginIp65504P1984L));
   	}




}
  
