package com.cloudframe.app.global.shared.file.records;

/**
*  The class XmlRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:25. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_xmlRecord")

@Data
public class XmlRecord extends XmlRecordSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] xmlRecordString = Field.fillLowValue(80);
	
	/**
	* Constructor for XmlRecord
	**/
    public XmlRecord() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }




}
  
