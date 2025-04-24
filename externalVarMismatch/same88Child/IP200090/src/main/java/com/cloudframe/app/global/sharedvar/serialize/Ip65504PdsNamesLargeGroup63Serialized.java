package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup63Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup63Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup63Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_63_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1923S;
            protected  int beginIp65504P1923L;
            protected  int beginIp65504P1924S;
            protected  int beginIp65504P1924L;
            protected  int beginIp65504P1925S;
            protected  int beginIp65504P1925L;
            protected  int beginIp65504P1926S;
            protected  int beginIp65504P1926L;
            protected  int beginIp65504P1927S;
            protected  int beginIp65504P1927L;
            protected  int beginIp65504P1928S;
            protected  int beginIp65504P1928L;
            protected  int beginIp65504P1929S;
            protected  int beginIp65504P1929L;
            protected  int beginIp65504P1930S;
            protected  int beginIp65504P1930L;
            protected  int beginIp65504P1931S;
            protected  int beginIp65504P1931L;
            protected  int beginIp65504P1932S;
            protected  int beginIp65504P1932L;
            protected  int beginIp65504P1933S;
            protected  int beginIp65504P1933L;
            protected  int beginIp65504P1934S;
            protected  int beginIp65504P1934L;
            protected  int beginIp65504P1935S;
            protected  int beginIp65504P1935L;
            protected  int beginIp65504P1936S;
            protected  int beginIp65504P1936L;
            protected  int beginIp65504P1937S;
            protected  int beginIp65504P1937L;
            protected  int beginIp65504P1938S;
            protected  int beginIp65504P1938L;
            protected  int beginIp65504P1939S;
            protected  int beginIp65504P1939L;
            protected  int beginIp65504P1940S;
            protected  int beginIp65504P1940L;
            protected  int beginIp65504P1941S;
            protected  int beginIp65504P1941L;
            protected  int beginIp65504P1942S;
            protected  int beginIp65504P1942L;
            protected  int beginIp65504P1943S;
            protected  int beginIp65504P1943L;
            protected  int beginIp65504P1944S;
            protected  int beginIp65504P1944L;
            protected  int beginIp65504P1945S;
            protected  int beginIp65504P1945L;
            protected  int beginIp65504P1946S;
            protected  int beginIp65504P1946L;
            protected  int beginIp65504P1947S;
            protected  int beginIp65504P1947L;
            protected  int beginIp65504P1948S;
            protected  int beginIp65504P1948L;
            protected  int beginIp65504P1949S;
            protected  int beginIp65504P1949L;
            protected  int beginIp65504P1950S;
            protected  int beginIp65504P1950L;
            protected  int beginIp65504P1951S;
            protected  int beginIp65504P1951L;
            protected  int beginIp65504P1952S;
            protected  int beginIp65504P1952L;
            protected  int beginIp65504P1953S;
            protected  int beginIp65504P1953L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup63Serialized
	**/
    public Ip65504PdsNamesLargeGroup63Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup63Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup63Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup63Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15372); // serialize this field at offset 15372 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup63Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15372 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup63Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_63_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1923S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1923L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1924S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1924L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1925S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1925L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1926S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1926L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1927S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1927L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1928S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1928L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1929S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1929L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1930S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1930L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1931S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1931L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1932S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1932L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1933S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1933L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1934S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1934L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1935S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1935L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1936S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1936L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1937S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1937L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1938S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1938L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1939S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1939L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1940S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1940L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1941S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1941L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1942S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1942L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1943S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1943L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1944S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1944L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1945S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1945L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1946S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1946L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1947S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1947L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1948S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1948L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1949S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1949L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1950S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1950L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1951S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1951L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1952S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1952L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1953S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1953L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1923SCounter = -1;
         public boolean isIp65504P1923SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1923SCounter != sharedCounter;
            localIp65504P1923SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1923_S_LEN = 2;
  	/**
	 * serializeIp65504P1923S
	 */
	protected void serializeIp65504P1923S(short ip65504P1923S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1923S,IP_65504_P_1923_S_LEN)
                  ,beginIp65504P1923S
                  ,IP_65504_P_1923_S_LEN
                 );
            localIp65504P1923SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1923SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1923S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1923S() {	 
			return (getShort(beginIp65504P1923S));
   	}
         int localIp65504P1923LCounter = -1;
         public boolean isIp65504P1923LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1923LCounter != sharedCounter;
            localIp65504P1923LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1923_L_LEN = 2;
  	/**
	 * serializeIp65504P1923L
	 */
	protected void serializeIp65504P1923L(short ip65504P1923L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1923L,IP_65504_P_1923_L_LEN)
                  ,beginIp65504P1923L
                  ,IP_65504_P_1923_L_LEN
                 );
            localIp65504P1923LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1923LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1923L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1923L() {	 
			return (getShort(beginIp65504P1923L));
   	}
         int localIp65504P1924SCounter = -1;
         public boolean isIp65504P1924SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1924SCounter != sharedCounter;
            localIp65504P1924SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1924_S_LEN = 2;
  	/**
	 * serializeIp65504P1924S
	 */
	protected void serializeIp65504P1924S(short ip65504P1924S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1924S,IP_65504_P_1924_S_LEN)
                  ,beginIp65504P1924S
                  ,IP_65504_P_1924_S_LEN
                 );
            localIp65504P1924SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1924SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1924S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1924S() {	 
			return (getShort(beginIp65504P1924S));
   	}
         int localIp65504P1924LCounter = -1;
         public boolean isIp65504P1924LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1924LCounter != sharedCounter;
            localIp65504P1924LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1924_L_LEN = 2;
  	/**
	 * serializeIp65504P1924L
	 */
	protected void serializeIp65504P1924L(short ip65504P1924L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1924L,IP_65504_P_1924_L_LEN)
                  ,beginIp65504P1924L
                  ,IP_65504_P_1924_L_LEN
                 );
            localIp65504P1924LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1924LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1924L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1924L() {	 
			return (getShort(beginIp65504P1924L));
   	}
         int localIp65504P1925SCounter = -1;
         public boolean isIp65504P1925SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1925SCounter != sharedCounter;
            localIp65504P1925SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1925_S_LEN = 2;
  	/**
	 * serializeIp65504P1925S
	 */
	protected void serializeIp65504P1925S(short ip65504P1925S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1925S,IP_65504_P_1925_S_LEN)
                  ,beginIp65504P1925S
                  ,IP_65504_P_1925_S_LEN
                 );
            localIp65504P1925SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1925SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1925S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1925S() {	 
			return (getShort(beginIp65504P1925S));
   	}
         int localIp65504P1925LCounter = -1;
         public boolean isIp65504P1925LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1925LCounter != sharedCounter;
            localIp65504P1925LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1925_L_LEN = 2;
  	/**
	 * serializeIp65504P1925L
	 */
	protected void serializeIp65504P1925L(short ip65504P1925L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1925L,IP_65504_P_1925_L_LEN)
                  ,beginIp65504P1925L
                  ,IP_65504_P_1925_L_LEN
                 );
            localIp65504P1925LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1925LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1925L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1925L() {	 
			return (getShort(beginIp65504P1925L));
   	}
         int localIp65504P1926SCounter = -1;
         public boolean isIp65504P1926SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1926SCounter != sharedCounter;
            localIp65504P1926SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1926_S_LEN = 2;
  	/**
	 * serializeIp65504P1926S
	 */
	protected void serializeIp65504P1926S(short ip65504P1926S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1926S,IP_65504_P_1926_S_LEN)
                  ,beginIp65504P1926S
                  ,IP_65504_P_1926_S_LEN
                 );
            localIp65504P1926SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1926SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1926S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1926S() {	 
			return (getShort(beginIp65504P1926S));
   	}
         int localIp65504P1926LCounter = -1;
         public boolean isIp65504P1926LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1926LCounter != sharedCounter;
            localIp65504P1926LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1926_L_LEN = 2;
  	/**
	 * serializeIp65504P1926L
	 */
	protected void serializeIp65504P1926L(short ip65504P1926L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1926L,IP_65504_P_1926_L_LEN)
                  ,beginIp65504P1926L
                  ,IP_65504_P_1926_L_LEN
                 );
            localIp65504P1926LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1926LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1926L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1926L() {	 
			return (getShort(beginIp65504P1926L));
   	}
         int localIp65504P1927SCounter = -1;
         public boolean isIp65504P1927SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1927SCounter != sharedCounter;
            localIp65504P1927SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1927_S_LEN = 2;
  	/**
	 * serializeIp65504P1927S
	 */
	protected void serializeIp65504P1927S(short ip65504P1927S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1927S,IP_65504_P_1927_S_LEN)
                  ,beginIp65504P1927S
                  ,IP_65504_P_1927_S_LEN
                 );
            localIp65504P1927SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1927SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1927S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1927S() {	 
			return (getShort(beginIp65504P1927S));
   	}
         int localIp65504P1927LCounter = -1;
         public boolean isIp65504P1927LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1927LCounter != sharedCounter;
            localIp65504P1927LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1927_L_LEN = 2;
  	/**
	 * serializeIp65504P1927L
	 */
	protected void serializeIp65504P1927L(short ip65504P1927L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1927L,IP_65504_P_1927_L_LEN)
                  ,beginIp65504P1927L
                  ,IP_65504_P_1927_L_LEN
                 );
            localIp65504P1927LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1927LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1927L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1927L() {	 
			return (getShort(beginIp65504P1927L));
   	}
         int localIp65504P1928SCounter = -1;
         public boolean isIp65504P1928SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1928SCounter != sharedCounter;
            localIp65504P1928SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1928_S_LEN = 2;
  	/**
	 * serializeIp65504P1928S
	 */
	protected void serializeIp65504P1928S(short ip65504P1928S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1928S,IP_65504_P_1928_S_LEN)
                  ,beginIp65504P1928S
                  ,IP_65504_P_1928_S_LEN
                 );
            localIp65504P1928SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1928SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1928S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1928S() {	 
			return (getShort(beginIp65504P1928S));
   	}
         int localIp65504P1928LCounter = -1;
         public boolean isIp65504P1928LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1928LCounter != sharedCounter;
            localIp65504P1928LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1928_L_LEN = 2;
  	/**
	 * serializeIp65504P1928L
	 */
	protected void serializeIp65504P1928L(short ip65504P1928L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1928L,IP_65504_P_1928_L_LEN)
                  ,beginIp65504P1928L
                  ,IP_65504_P_1928_L_LEN
                 );
            localIp65504P1928LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1928LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1928L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1928L() {	 
			return (getShort(beginIp65504P1928L));
   	}
         int localIp65504P1929SCounter = -1;
         public boolean isIp65504P1929SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1929SCounter != sharedCounter;
            localIp65504P1929SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1929_S_LEN = 2;
  	/**
	 * serializeIp65504P1929S
	 */
	protected void serializeIp65504P1929S(short ip65504P1929S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1929S,IP_65504_P_1929_S_LEN)
                  ,beginIp65504P1929S
                  ,IP_65504_P_1929_S_LEN
                 );
            localIp65504P1929SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1929SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1929S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1929S() {	 
			return (getShort(beginIp65504P1929S));
   	}
         int localIp65504P1929LCounter = -1;
         public boolean isIp65504P1929LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1929LCounter != sharedCounter;
            localIp65504P1929LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1929_L_LEN = 2;
  	/**
	 * serializeIp65504P1929L
	 */
	protected void serializeIp65504P1929L(short ip65504P1929L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1929L,IP_65504_P_1929_L_LEN)
                  ,beginIp65504P1929L
                  ,IP_65504_P_1929_L_LEN
                 );
            localIp65504P1929LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1929LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1929L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1929L() {	 
			return (getShort(beginIp65504P1929L));
   	}
         int localIp65504P1930SCounter = -1;
         public boolean isIp65504P1930SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1930SCounter != sharedCounter;
            localIp65504P1930SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1930_S_LEN = 2;
  	/**
	 * serializeIp65504P1930S
	 */
	protected void serializeIp65504P1930S(short ip65504P1930S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1930S,IP_65504_P_1930_S_LEN)
                  ,beginIp65504P1930S
                  ,IP_65504_P_1930_S_LEN
                 );
            localIp65504P1930SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1930SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1930S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1930S() {	 
			return (getShort(beginIp65504P1930S));
   	}
         int localIp65504P1930LCounter = -1;
         public boolean isIp65504P1930LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1930LCounter != sharedCounter;
            localIp65504P1930LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1930_L_LEN = 2;
  	/**
	 * serializeIp65504P1930L
	 */
	protected void serializeIp65504P1930L(short ip65504P1930L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1930L,IP_65504_P_1930_L_LEN)
                  ,beginIp65504P1930L
                  ,IP_65504_P_1930_L_LEN
                 );
            localIp65504P1930LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1930LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1930L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1930L() {	 
			return (getShort(beginIp65504P1930L));
   	}
         int localIp65504P1931SCounter = -1;
         public boolean isIp65504P1931SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1931SCounter != sharedCounter;
            localIp65504P1931SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1931_S_LEN = 2;
  	/**
	 * serializeIp65504P1931S
	 */
	protected void serializeIp65504P1931S(short ip65504P1931S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1931S,IP_65504_P_1931_S_LEN)
                  ,beginIp65504P1931S
                  ,IP_65504_P_1931_S_LEN
                 );
            localIp65504P1931SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1931SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1931S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1931S() {	 
			return (getShort(beginIp65504P1931S));
   	}
         int localIp65504P1931LCounter = -1;
         public boolean isIp65504P1931LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1931LCounter != sharedCounter;
            localIp65504P1931LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1931_L_LEN = 2;
  	/**
	 * serializeIp65504P1931L
	 */
	protected void serializeIp65504P1931L(short ip65504P1931L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1931L,IP_65504_P_1931_L_LEN)
                  ,beginIp65504P1931L
                  ,IP_65504_P_1931_L_LEN
                 );
            localIp65504P1931LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1931LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1931L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1931L() {	 
			return (getShort(beginIp65504P1931L));
   	}
         int localIp65504P1932SCounter = -1;
         public boolean isIp65504P1932SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1932SCounter != sharedCounter;
            localIp65504P1932SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1932_S_LEN = 2;
  	/**
	 * serializeIp65504P1932S
	 */
	protected void serializeIp65504P1932S(short ip65504P1932S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1932S,IP_65504_P_1932_S_LEN)
                  ,beginIp65504P1932S
                  ,IP_65504_P_1932_S_LEN
                 );
            localIp65504P1932SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1932SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1932S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1932S() {	 
			return (getShort(beginIp65504P1932S));
   	}
         int localIp65504P1932LCounter = -1;
         public boolean isIp65504P1932LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1932LCounter != sharedCounter;
            localIp65504P1932LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1932_L_LEN = 2;
  	/**
	 * serializeIp65504P1932L
	 */
	protected void serializeIp65504P1932L(short ip65504P1932L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1932L,IP_65504_P_1932_L_LEN)
                  ,beginIp65504P1932L
                  ,IP_65504_P_1932_L_LEN
                 );
            localIp65504P1932LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1932LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1932L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1932L() {	 
			return (getShort(beginIp65504P1932L));
   	}
         int localIp65504P1933SCounter = -1;
         public boolean isIp65504P1933SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1933SCounter != sharedCounter;
            localIp65504P1933SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1933_S_LEN = 2;
  	/**
	 * serializeIp65504P1933S
	 */
	protected void serializeIp65504P1933S(short ip65504P1933S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1933S,IP_65504_P_1933_S_LEN)
                  ,beginIp65504P1933S
                  ,IP_65504_P_1933_S_LEN
                 );
            localIp65504P1933SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1933SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1933S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1933S() {	 
			return (getShort(beginIp65504P1933S));
   	}
         int localIp65504P1933LCounter = -1;
         public boolean isIp65504P1933LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1933LCounter != sharedCounter;
            localIp65504P1933LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1933_L_LEN = 2;
  	/**
	 * serializeIp65504P1933L
	 */
	protected void serializeIp65504P1933L(short ip65504P1933L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1933L,IP_65504_P_1933_L_LEN)
                  ,beginIp65504P1933L
                  ,IP_65504_P_1933_L_LEN
                 );
            localIp65504P1933LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1933LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1933L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1933L() {	 
			return (getShort(beginIp65504P1933L));
   	}
         int localIp65504P1934SCounter = -1;
         public boolean isIp65504P1934SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1934SCounter != sharedCounter;
            localIp65504P1934SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1934_S_LEN = 2;
  	/**
	 * serializeIp65504P1934S
	 */
	protected void serializeIp65504P1934S(short ip65504P1934S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1934S,IP_65504_P_1934_S_LEN)
                  ,beginIp65504P1934S
                  ,IP_65504_P_1934_S_LEN
                 );
            localIp65504P1934SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1934SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1934S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1934S() {	 
			return (getShort(beginIp65504P1934S));
   	}
         int localIp65504P1934LCounter = -1;
         public boolean isIp65504P1934LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1934LCounter != sharedCounter;
            localIp65504P1934LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1934_L_LEN = 2;
  	/**
	 * serializeIp65504P1934L
	 */
	protected void serializeIp65504P1934L(short ip65504P1934L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1934L,IP_65504_P_1934_L_LEN)
                  ,beginIp65504P1934L
                  ,IP_65504_P_1934_L_LEN
                 );
            localIp65504P1934LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1934LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1934L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1934L() {	 
			return (getShort(beginIp65504P1934L));
   	}
         int localIp65504P1935SCounter = -1;
         public boolean isIp65504P1935SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1935SCounter != sharedCounter;
            localIp65504P1935SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1935_S_LEN = 2;
  	/**
	 * serializeIp65504P1935S
	 */
	protected void serializeIp65504P1935S(short ip65504P1935S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1935S,IP_65504_P_1935_S_LEN)
                  ,beginIp65504P1935S
                  ,IP_65504_P_1935_S_LEN
                 );
            localIp65504P1935SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1935SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1935S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1935S() {	 
			return (getShort(beginIp65504P1935S));
   	}
         int localIp65504P1935LCounter = -1;
         public boolean isIp65504P1935LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1935LCounter != sharedCounter;
            localIp65504P1935LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1935_L_LEN = 2;
  	/**
	 * serializeIp65504P1935L
	 */
	protected void serializeIp65504P1935L(short ip65504P1935L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1935L,IP_65504_P_1935_L_LEN)
                  ,beginIp65504P1935L
                  ,IP_65504_P_1935_L_LEN
                 );
            localIp65504P1935LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1935LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1935L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1935L() {	 
			return (getShort(beginIp65504P1935L));
   	}
         int localIp65504P1936SCounter = -1;
         public boolean isIp65504P1936SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1936SCounter != sharedCounter;
            localIp65504P1936SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1936_S_LEN = 2;
  	/**
	 * serializeIp65504P1936S
	 */
	protected void serializeIp65504P1936S(short ip65504P1936S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1936S,IP_65504_P_1936_S_LEN)
                  ,beginIp65504P1936S
                  ,IP_65504_P_1936_S_LEN
                 );
            localIp65504P1936SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1936SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1936S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1936S() {	 
			return (getShort(beginIp65504P1936S));
   	}
         int localIp65504P1936LCounter = -1;
         public boolean isIp65504P1936LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1936LCounter != sharedCounter;
            localIp65504P1936LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1936_L_LEN = 2;
  	/**
	 * serializeIp65504P1936L
	 */
	protected void serializeIp65504P1936L(short ip65504P1936L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1936L,IP_65504_P_1936_L_LEN)
                  ,beginIp65504P1936L
                  ,IP_65504_P_1936_L_LEN
                 );
            localIp65504P1936LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1936LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1936L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1936L() {	 
			return (getShort(beginIp65504P1936L));
   	}
         int localIp65504P1937SCounter = -1;
         public boolean isIp65504P1937SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1937SCounter != sharedCounter;
            localIp65504P1937SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1937_S_LEN = 2;
  	/**
	 * serializeIp65504P1937S
	 */
	protected void serializeIp65504P1937S(short ip65504P1937S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1937S,IP_65504_P_1937_S_LEN)
                  ,beginIp65504P1937S
                  ,IP_65504_P_1937_S_LEN
                 );
            localIp65504P1937SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1937SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1937S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1937S() {	 
			return (getShort(beginIp65504P1937S));
   	}
         int localIp65504P1937LCounter = -1;
         public boolean isIp65504P1937LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1937LCounter != sharedCounter;
            localIp65504P1937LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1937_L_LEN = 2;
  	/**
	 * serializeIp65504P1937L
	 */
	protected void serializeIp65504P1937L(short ip65504P1937L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1937L,IP_65504_P_1937_L_LEN)
                  ,beginIp65504P1937L
                  ,IP_65504_P_1937_L_LEN
                 );
            localIp65504P1937LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1937LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1937L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1937L() {	 
			return (getShort(beginIp65504P1937L));
   	}
         int localIp65504P1938SCounter = -1;
         public boolean isIp65504P1938SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1938SCounter != sharedCounter;
            localIp65504P1938SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1938_S_LEN = 2;
  	/**
	 * serializeIp65504P1938S
	 */
	protected void serializeIp65504P1938S(short ip65504P1938S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1938S,IP_65504_P_1938_S_LEN)
                  ,beginIp65504P1938S
                  ,IP_65504_P_1938_S_LEN
                 );
            localIp65504P1938SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1938SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1938S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1938S() {	 
			return (getShort(beginIp65504P1938S));
   	}
         int localIp65504P1938LCounter = -1;
         public boolean isIp65504P1938LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1938LCounter != sharedCounter;
            localIp65504P1938LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1938_L_LEN = 2;
  	/**
	 * serializeIp65504P1938L
	 */
	protected void serializeIp65504P1938L(short ip65504P1938L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1938L,IP_65504_P_1938_L_LEN)
                  ,beginIp65504P1938L
                  ,IP_65504_P_1938_L_LEN
                 );
            localIp65504P1938LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1938LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1938L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1938L() {	 
			return (getShort(beginIp65504P1938L));
   	}
         int localIp65504P1939SCounter = -1;
         public boolean isIp65504P1939SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1939SCounter != sharedCounter;
            localIp65504P1939SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1939_S_LEN = 2;
  	/**
	 * serializeIp65504P1939S
	 */
	protected void serializeIp65504P1939S(short ip65504P1939S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1939S,IP_65504_P_1939_S_LEN)
                  ,beginIp65504P1939S
                  ,IP_65504_P_1939_S_LEN
                 );
            localIp65504P1939SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1939SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1939S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1939S() {	 
			return (getShort(beginIp65504P1939S));
   	}
         int localIp65504P1939LCounter = -1;
         public boolean isIp65504P1939LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1939LCounter != sharedCounter;
            localIp65504P1939LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1939_L_LEN = 2;
  	/**
	 * serializeIp65504P1939L
	 */
	protected void serializeIp65504P1939L(short ip65504P1939L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1939L,IP_65504_P_1939_L_LEN)
                  ,beginIp65504P1939L
                  ,IP_65504_P_1939_L_LEN
                 );
            localIp65504P1939LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1939LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1939L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1939L() {	 
			return (getShort(beginIp65504P1939L));
   	}
         int localIp65504P1940SCounter = -1;
         public boolean isIp65504P1940SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1940SCounter != sharedCounter;
            localIp65504P1940SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1940_S_LEN = 2;
  	/**
	 * serializeIp65504P1940S
	 */
	protected void serializeIp65504P1940S(short ip65504P1940S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1940S,IP_65504_P_1940_S_LEN)
                  ,beginIp65504P1940S
                  ,IP_65504_P_1940_S_LEN
                 );
            localIp65504P1940SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1940SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1940S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1940S() {	 
			return (getShort(beginIp65504P1940S));
   	}
         int localIp65504P1940LCounter = -1;
         public boolean isIp65504P1940LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1940LCounter != sharedCounter;
            localIp65504P1940LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1940_L_LEN = 2;
  	/**
	 * serializeIp65504P1940L
	 */
	protected void serializeIp65504P1940L(short ip65504P1940L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1940L,IP_65504_P_1940_L_LEN)
                  ,beginIp65504P1940L
                  ,IP_65504_P_1940_L_LEN
                 );
            localIp65504P1940LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1940LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1940L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1940L() {	 
			return (getShort(beginIp65504P1940L));
   	}
         int localIp65504P1941SCounter = -1;
         public boolean isIp65504P1941SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1941SCounter != sharedCounter;
            localIp65504P1941SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1941_S_LEN = 2;
  	/**
	 * serializeIp65504P1941S
	 */
	protected void serializeIp65504P1941S(short ip65504P1941S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1941S,IP_65504_P_1941_S_LEN)
                  ,beginIp65504P1941S
                  ,IP_65504_P_1941_S_LEN
                 );
            localIp65504P1941SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1941SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1941S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1941S() {	 
			return (getShort(beginIp65504P1941S));
   	}
         int localIp65504P1941LCounter = -1;
         public boolean isIp65504P1941LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1941LCounter != sharedCounter;
            localIp65504P1941LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1941_L_LEN = 2;
  	/**
	 * serializeIp65504P1941L
	 */
	protected void serializeIp65504P1941L(short ip65504P1941L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1941L,IP_65504_P_1941_L_LEN)
                  ,beginIp65504P1941L
                  ,IP_65504_P_1941_L_LEN
                 );
            localIp65504P1941LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1941LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1941L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1941L() {	 
			return (getShort(beginIp65504P1941L));
   	}
         int localIp65504P1942SCounter = -1;
         public boolean isIp65504P1942SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1942SCounter != sharedCounter;
            localIp65504P1942SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1942_S_LEN = 2;
  	/**
	 * serializeIp65504P1942S
	 */
	protected void serializeIp65504P1942S(short ip65504P1942S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1942S,IP_65504_P_1942_S_LEN)
                  ,beginIp65504P1942S
                  ,IP_65504_P_1942_S_LEN
                 );
            localIp65504P1942SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1942SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1942S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1942S() {	 
			return (getShort(beginIp65504P1942S));
   	}
         int localIp65504P1942LCounter = -1;
         public boolean isIp65504P1942LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1942LCounter != sharedCounter;
            localIp65504P1942LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1942_L_LEN = 2;
  	/**
	 * serializeIp65504P1942L
	 */
	protected void serializeIp65504P1942L(short ip65504P1942L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1942L,IP_65504_P_1942_L_LEN)
                  ,beginIp65504P1942L
                  ,IP_65504_P_1942_L_LEN
                 );
            localIp65504P1942LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1942LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1942L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1942L() {	 
			return (getShort(beginIp65504P1942L));
   	}
         int localIp65504P1943SCounter = -1;
         public boolean isIp65504P1943SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1943SCounter != sharedCounter;
            localIp65504P1943SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1943_S_LEN = 2;
  	/**
	 * serializeIp65504P1943S
	 */
	protected void serializeIp65504P1943S(short ip65504P1943S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1943S,IP_65504_P_1943_S_LEN)
                  ,beginIp65504P1943S
                  ,IP_65504_P_1943_S_LEN
                 );
            localIp65504P1943SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1943SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1943S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1943S() {	 
			return (getShort(beginIp65504P1943S));
   	}
         int localIp65504P1943LCounter = -1;
         public boolean isIp65504P1943LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1943LCounter != sharedCounter;
            localIp65504P1943LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1943_L_LEN = 2;
  	/**
	 * serializeIp65504P1943L
	 */
	protected void serializeIp65504P1943L(short ip65504P1943L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1943L,IP_65504_P_1943_L_LEN)
                  ,beginIp65504P1943L
                  ,IP_65504_P_1943_L_LEN
                 );
            localIp65504P1943LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1943LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1943L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1943L() {	 
			return (getShort(beginIp65504P1943L));
   	}
         int localIp65504P1944SCounter = -1;
         public boolean isIp65504P1944SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1944SCounter != sharedCounter;
            localIp65504P1944SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1944_S_LEN = 2;
  	/**
	 * serializeIp65504P1944S
	 */
	protected void serializeIp65504P1944S(short ip65504P1944S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1944S,IP_65504_P_1944_S_LEN)
                  ,beginIp65504P1944S
                  ,IP_65504_P_1944_S_LEN
                 );
            localIp65504P1944SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1944SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1944S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1944S() {	 
			return (getShort(beginIp65504P1944S));
   	}
         int localIp65504P1944LCounter = -1;
         public boolean isIp65504P1944LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1944LCounter != sharedCounter;
            localIp65504P1944LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1944_L_LEN = 2;
  	/**
	 * serializeIp65504P1944L
	 */
	protected void serializeIp65504P1944L(short ip65504P1944L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1944L,IP_65504_P_1944_L_LEN)
                  ,beginIp65504P1944L
                  ,IP_65504_P_1944_L_LEN
                 );
            localIp65504P1944LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1944LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1944L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1944L() {	 
			return (getShort(beginIp65504P1944L));
   	}
         int localIp65504P1945SCounter = -1;
         public boolean isIp65504P1945SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1945SCounter != sharedCounter;
            localIp65504P1945SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1945_S_LEN = 2;
  	/**
	 * serializeIp65504P1945S
	 */
	protected void serializeIp65504P1945S(short ip65504P1945S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1945S,IP_65504_P_1945_S_LEN)
                  ,beginIp65504P1945S
                  ,IP_65504_P_1945_S_LEN
                 );
            localIp65504P1945SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1945SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1945S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1945S() {	 
			return (getShort(beginIp65504P1945S));
   	}
         int localIp65504P1945LCounter = -1;
         public boolean isIp65504P1945LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1945LCounter != sharedCounter;
            localIp65504P1945LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1945_L_LEN = 2;
  	/**
	 * serializeIp65504P1945L
	 */
	protected void serializeIp65504P1945L(short ip65504P1945L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1945L,IP_65504_P_1945_L_LEN)
                  ,beginIp65504P1945L
                  ,IP_65504_P_1945_L_LEN
                 );
            localIp65504P1945LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1945LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1945L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1945L() {	 
			return (getShort(beginIp65504P1945L));
   	}
         int localIp65504P1946SCounter = -1;
         public boolean isIp65504P1946SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1946SCounter != sharedCounter;
            localIp65504P1946SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1946_S_LEN = 2;
  	/**
	 * serializeIp65504P1946S
	 */
	protected void serializeIp65504P1946S(short ip65504P1946S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1946S,IP_65504_P_1946_S_LEN)
                  ,beginIp65504P1946S
                  ,IP_65504_P_1946_S_LEN
                 );
            localIp65504P1946SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1946SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1946S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1946S() {	 
			return (getShort(beginIp65504P1946S));
   	}
         int localIp65504P1946LCounter = -1;
         public boolean isIp65504P1946LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1946LCounter != sharedCounter;
            localIp65504P1946LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1946_L_LEN = 2;
  	/**
	 * serializeIp65504P1946L
	 */
	protected void serializeIp65504P1946L(short ip65504P1946L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1946L,IP_65504_P_1946_L_LEN)
                  ,beginIp65504P1946L
                  ,IP_65504_P_1946_L_LEN
                 );
            localIp65504P1946LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1946LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1946L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1946L() {	 
			return (getShort(beginIp65504P1946L));
   	}
         int localIp65504P1947SCounter = -1;
         public boolean isIp65504P1947SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1947SCounter != sharedCounter;
            localIp65504P1947SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1947_S_LEN = 2;
  	/**
	 * serializeIp65504P1947S
	 */
	protected void serializeIp65504P1947S(short ip65504P1947S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1947S,IP_65504_P_1947_S_LEN)
                  ,beginIp65504P1947S
                  ,IP_65504_P_1947_S_LEN
                 );
            localIp65504P1947SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1947SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1947S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1947S() {	 
			return (getShort(beginIp65504P1947S));
   	}
         int localIp65504P1947LCounter = -1;
         public boolean isIp65504P1947LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1947LCounter != sharedCounter;
            localIp65504P1947LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1947_L_LEN = 2;
  	/**
	 * serializeIp65504P1947L
	 */
	protected void serializeIp65504P1947L(short ip65504P1947L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1947L,IP_65504_P_1947_L_LEN)
                  ,beginIp65504P1947L
                  ,IP_65504_P_1947_L_LEN
                 );
            localIp65504P1947LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1947LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1947L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1947L() {	 
			return (getShort(beginIp65504P1947L));
   	}
         int localIp65504P1948SCounter = -1;
         public boolean isIp65504P1948SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1948SCounter != sharedCounter;
            localIp65504P1948SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1948_S_LEN = 2;
  	/**
	 * serializeIp65504P1948S
	 */
	protected void serializeIp65504P1948S(short ip65504P1948S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1948S,IP_65504_P_1948_S_LEN)
                  ,beginIp65504P1948S
                  ,IP_65504_P_1948_S_LEN
                 );
            localIp65504P1948SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1948SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1948S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1948S() {	 
			return (getShort(beginIp65504P1948S));
   	}
         int localIp65504P1948LCounter = -1;
         public boolean isIp65504P1948LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1948LCounter != sharedCounter;
            localIp65504P1948LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1948_L_LEN = 2;
  	/**
	 * serializeIp65504P1948L
	 */
	protected void serializeIp65504P1948L(short ip65504P1948L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1948L,IP_65504_P_1948_L_LEN)
                  ,beginIp65504P1948L
                  ,IP_65504_P_1948_L_LEN
                 );
            localIp65504P1948LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1948LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1948L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1948L() {	 
			return (getShort(beginIp65504P1948L));
   	}
         int localIp65504P1949SCounter = -1;
         public boolean isIp65504P1949SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1949SCounter != sharedCounter;
            localIp65504P1949SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1949_S_LEN = 2;
  	/**
	 * serializeIp65504P1949S
	 */
	protected void serializeIp65504P1949S(short ip65504P1949S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1949S,IP_65504_P_1949_S_LEN)
                  ,beginIp65504P1949S
                  ,IP_65504_P_1949_S_LEN
                 );
            localIp65504P1949SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1949SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1949S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1949S() {	 
			return (getShort(beginIp65504P1949S));
   	}
         int localIp65504P1949LCounter = -1;
         public boolean isIp65504P1949LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1949LCounter != sharedCounter;
            localIp65504P1949LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1949_L_LEN = 2;
  	/**
	 * serializeIp65504P1949L
	 */
	protected void serializeIp65504P1949L(short ip65504P1949L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1949L,IP_65504_P_1949_L_LEN)
                  ,beginIp65504P1949L
                  ,IP_65504_P_1949_L_LEN
                 );
            localIp65504P1949LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1949LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1949L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1949L() {	 
			return (getShort(beginIp65504P1949L));
   	}
         int localIp65504P1950SCounter = -1;
         public boolean isIp65504P1950SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1950SCounter != sharedCounter;
            localIp65504P1950SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1950_S_LEN = 2;
  	/**
	 * serializeIp65504P1950S
	 */
	protected void serializeIp65504P1950S(short ip65504P1950S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1950S,IP_65504_P_1950_S_LEN)
                  ,beginIp65504P1950S
                  ,IP_65504_P_1950_S_LEN
                 );
            localIp65504P1950SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1950SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1950S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1950S() {	 
			return (getShort(beginIp65504P1950S));
   	}
         int localIp65504P1950LCounter = -1;
         public boolean isIp65504P1950LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1950LCounter != sharedCounter;
            localIp65504P1950LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1950_L_LEN = 2;
  	/**
	 * serializeIp65504P1950L
	 */
	protected void serializeIp65504P1950L(short ip65504P1950L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1950L,IP_65504_P_1950_L_LEN)
                  ,beginIp65504P1950L
                  ,IP_65504_P_1950_L_LEN
                 );
            localIp65504P1950LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1950LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1950L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1950L() {	 
			return (getShort(beginIp65504P1950L));
   	}
         int localIp65504P1951SCounter = -1;
         public boolean isIp65504P1951SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1951SCounter != sharedCounter;
            localIp65504P1951SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1951_S_LEN = 2;
  	/**
	 * serializeIp65504P1951S
	 */
	protected void serializeIp65504P1951S(short ip65504P1951S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1951S,IP_65504_P_1951_S_LEN)
                  ,beginIp65504P1951S
                  ,IP_65504_P_1951_S_LEN
                 );
            localIp65504P1951SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1951SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1951S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1951S() {	 
			return (getShort(beginIp65504P1951S));
   	}
         int localIp65504P1951LCounter = -1;
         public boolean isIp65504P1951LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1951LCounter != sharedCounter;
            localIp65504P1951LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1951_L_LEN = 2;
  	/**
	 * serializeIp65504P1951L
	 */
	protected void serializeIp65504P1951L(short ip65504P1951L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1951L,IP_65504_P_1951_L_LEN)
                  ,beginIp65504P1951L
                  ,IP_65504_P_1951_L_LEN
                 );
            localIp65504P1951LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1951LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1951L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1951L() {	 
			return (getShort(beginIp65504P1951L));
   	}
         int localIp65504P1952SCounter = -1;
         public boolean isIp65504P1952SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1952SCounter != sharedCounter;
            localIp65504P1952SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1952_S_LEN = 2;
  	/**
	 * serializeIp65504P1952S
	 */
	protected void serializeIp65504P1952S(short ip65504P1952S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1952S,IP_65504_P_1952_S_LEN)
                  ,beginIp65504P1952S
                  ,IP_65504_P_1952_S_LEN
                 );
            localIp65504P1952SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1952SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1952S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1952S() {	 
			return (getShort(beginIp65504P1952S));
   	}
         int localIp65504P1952LCounter = -1;
         public boolean isIp65504P1952LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1952LCounter != sharedCounter;
            localIp65504P1952LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1952_L_LEN = 2;
  	/**
	 * serializeIp65504P1952L
	 */
	protected void serializeIp65504P1952L(short ip65504P1952L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1952L,IP_65504_P_1952_L_LEN)
                  ,beginIp65504P1952L
                  ,IP_65504_P_1952_L_LEN
                 );
            localIp65504P1952LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1952LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1952L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1952L() {	 
			return (getShort(beginIp65504P1952L));
   	}
         int localIp65504P1953SCounter = -1;
         public boolean isIp65504P1953SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1953SCounter != sharedCounter;
            localIp65504P1953SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1953_S_LEN = 2;
  	/**
	 * serializeIp65504P1953S
	 */
	protected void serializeIp65504P1953S(short ip65504P1953S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1953S,IP_65504_P_1953_S_LEN)
                  ,beginIp65504P1953S
                  ,IP_65504_P_1953_S_LEN
                 );
            localIp65504P1953SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1953SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1953S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1953S() {	 
			return (getShort(beginIp65504P1953S));
   	}
         int localIp65504P1953LCounter = -1;
         public boolean isIp65504P1953LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1953LCounter != sharedCounter;
            localIp65504P1953LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1953_L_LEN = 2;
  	/**
	 * serializeIp65504P1953L
	 */
	protected void serializeIp65504P1953L(short ip65504P1953L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1953L,IP_65504_P_1953_L_LEN)
                  ,beginIp65504P1953L
                  ,IP_65504_P_1953_L_LEN
                 );
            localIp65504P1953LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1953LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1953L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1953L() {	 
			return (getShort(beginIp65504P1953L));
   	}




}
  
