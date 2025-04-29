package com.cloudframe.app.global.shared.file.records;

/**
*  The class XmlRecordMaxGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:36. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

            @Component("global_xmlRecordMaxGroup")

@Data
public class XmlRecordMaxGroup extends XmlRecordMaxGroupSerialized  implements InitializingBean {
   
				@Autowired
    			@Qualifier("global_xmlRecordMax")    			
					@Getter @Setter private XmlRecordMax xmlRecordMax;
				@Autowired
    			@Qualifier("global_xmlRecordMin")    			
					@Getter @Setter private XmlRecordMin xmlRecordMin;
	
	/**
	* Constructor for XmlRecordMaxGroup
	**/
    public XmlRecordMaxGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getXmlRecordMax().setParent(this,getStartOffset() + 0);
					getXmlRecordMin().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  
