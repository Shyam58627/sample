package com.onlinetutorialspoint.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/javainuse-kafka/")
public class HelloController {

    @Autowired
    KafkaTemplate<String,String> KafkaTemplate;
   String TOPIC_NAME = "MyTest";
   // String TOPIC_NAME = "t1-uci";
   @GetMapping(value = "/producer")
	public String producer(@RequestParam("message") String message) {
  /*  @GetMapping("/say/{msg}")
    public String postMessage(@PathVariable("msg") String msg){
    	
   */   //  KafkaTemplate.send(TOPIC_NAME,msg);
        int numTimes=5;
        
     //   String data1 ="{\"entityName\":\"BiographicsData\",\"globalId\":\"c611a616-b7bd-42d1-802b-efbe8a13497c\",\"customerId\":\"139516\",\"processType\":\"createCustomer\",\"entityData\":{\"emails\":[{\"customerId\":\"139516\",\"id\":\"139516\",\"label\":\"L1\",\"type\":\"personal\",\"preferred\":false,\"email\":\"gagan@test.com\"}],\"addresses\":[{\"country\":\"India\",\"line4\":\"-\",\"postalCode\":\"560017\",\"customerId\":\"139516\",\"locality\":\"Karnataka\",\"id\":\"139516\",\"label\":\"L1\",\"type\":\"2\",\"region\":\"H\",\"line3\":\"-\",\"line2\":\"-\",\"line1\":\"STREET\"}],\"education\":\"B.E\",\"idDocs\":[{\"customerId\":\"139516\",\"id\":\"139516\",\"primary\":false}],\"customerId\":\"139516\",\"phones\":[{\"ext\":\"0\",\"number\":\"1122334455\",\"areaCode\":\"91\",\"countryCode\":\"IN\",\"customerId\":\"139516\",\"id\":\"139516\",\"label\":\"L1\",\"type\":\"personal\",\"preferred\":false}],\"biographics\":{\"lastName\":\"ASRIUU\",\"placeOfBirth\":\"Bangalore\",\"gender\":\"MALE\",\"prefix\":\"MR\",\"suffix\":\"BB\",\"residencyCountryCode\":\"US\",\"firstName\":\"DFCZRIUU\",\"residencyStatus\":\"US\",\"nationality\":\"US\",\"countryOfBirth\":\"INDIA\",\"dob\":\"19980519\",\"customerId\":\"139516\",\"middleName\":\"ASRIUU\",\"id\":\"139516\",\"maritalStatus\":\"SINGLE\",\"residencyType\":\"US\"},\"employment\":[{\"duration\":\"1\",\"occupationCode\":\"1234\",\"jobTitle\":\"true\",\"customerId\":\"\",\"description\":\"2019-03-18T06:46:19.446Z\",\"employerName\":\"Ename\",\"email\":\"test1@test.com\",\"industryCode\":\"4321\"}]}}";
//	String data1 = "{\"entityName\":\"BiographicsData\",\"globalId\":\"1ebcc1c1-9f35-4908-afd7-29239cde41c7\",\"customerId\":\"139362\",\"processType\":\"createCustomer\",\"entityData\":\"{\\\"customerId\\\":\\\"139362\\\",\\\"biographics\\\":{\\\"id\\\":\\\"139362\\\",\\\"customerId\\\":\\\"139362\\\",\\\"firstName\\\":\\\"RIOIFDRT\\\",\\\"middleName\\\":\\\"RIOIFDRT\\\",\\\"lastName\\\":\\\"RIOIFDRT\\\",\\\"prefix\\\":\\\"AA\\\",\\\"suffix\\\":\\\"BB\\\",\\\"gender\\\":\\\"MALE\\\",\\\"dob\\\":\\\"19990106\\\",\\\"placeOfBirth\\\":\\\"Bangalore\\\",\\\"countryOfBirth\\\":\\\"US\\\",\\\"residencyCountryCode\\\":\\\"US\\\",\\\"residencyStatus\\\":\\\"US\\\",\\\"residencyType\\\":\\\"US\\\",\\\"nationality\\\":\\\"US\\\",\\\"maritalStatus\\\":\\\"SINGLE\\\"},\\\"addresses\\\":[{\\\"id\\\":\\\"139362\\\",\\\"customerId\\\":\\\"139362\\\",\\\"type\\\":\\\"2\\\",\\\"label\\\":\\\"L1\\\",\\\"line1\\\":\\\"STREET\\\",\\\"line2\\\":\\\"-\\\",\\\"line3\\\":\\\"-\\\",\\\"line4\\\":\\\"-\\\",\\\"locality\\\":\\\"Karnataka\\\",\\\"region\\\":\\\"H\\\",\\\"postalCode\\\":\\\"569999\\\",\\\"country\\\":\\\"India\\\",\\\"name\\\":null}],\\\"emails\\\":[{\\\"id\\\":\\\"139362\\\",\\\"customerId\\\":\\\"139362\\\",\\\"type\\\":\\\"personal\\\",\\\"label\\\":\\\"L1\\\",\\\"email\\\":\\\"manish@test.com\\\",\\\"preferred\\\":false}],\\\"phones\\\":[{\\\"id\\\":\\\"139362\\\",\\\"customerId\\\":\\\"139362\\\",\\\"type\\\":\\\"personal\\\",\\\"label\\\":\\\"L1\\\",\\\"number\\\":\\\"9900990099\\\",\\\"countryCode\\\":\\\"IN\\\",\\\"areaCode\\\":\\\"91\\\",\\\"ext\\\":\\\"0\\\",\\\"preferred\\\":false}],\\\"idDocs\\\":[{\\\"id\\\":\\\"139362\\\",\\\"customerId\\\":\\\"139362\\\",\\\"type\\\":null,\\\"primary\\\":false,\\\"number\\\":null,\\\"expiry\\\":null,\\\"issuancePlace\\\":null,\\\"issuanceCountry\\\":null}],\\\"education\\\":\\\"B.E\\\",\\\"employment\\\":[{\\\"customerId\\\":\\\"\\\",\\\"employerName\\\":\\\"Ename\\\",\\\"jobTitle\\\":\\\"true\\\",\\\"occupationCode\\\":\\\"1234\\\",\\\"description\\\":\\\"2019-03-18T06:46:19.446Z\\\",\\\"industryCode\\\":\\\"4321\\\",\\\"duration\\\":\\\"1\\\",\\\"email\\\":\\\"test1@test.com\\\"}]}\"}";
  String data1= "{\"entityName\":\"BiographicsData\",\"globalId\":\"1ebcc1c1-9f35-4908-afd7-29239cde41c7\",\"customerId\":\"139362\",\"processType\":\"createCustomer\",\"entityData\":\"{\"customerId\":\"139362\",\"biographics\":{\"id\":\"139362\",\"customerId\":\"139362\",\"firstName\":\"RIOIFDRT\",\"middleName\":\"RIOIFDRT\",\"lastName\":\"RIOIFDRT\",\"prefix\":\"AA\",\"suffix\":\"BB\",\"gender\":\"MALE\",\"dob\":\"19990106\",\"placeOfBirth\":\"Bangalore\",\"countryOfBirth\":\"US\",\"residencyCountryCode\":\"US\",\"residencyStatus\":\"US\",\"residencyType\":\"US\",\"nationality\":\"US\",\"maritalStatus\":\"SINGLE\"},\"addresses\":[{\"id\":\"139362\",\"customerId\":\"139362\",\"type\":\"2\",\"label\":\"L1\",\"line1\":\"STREET\",\"line2\":\"-\",\"line3\":\"-\",\"line4\":\"-\",\"locality\":\"Karnataka\",\"region\":\"H\",\"postalCode\":\"569999\",\"country\":\"India\",\"name\":null}],\"emails\":[{\"id\":\"139362\",\"customerId\":\"139362\",\"type\":\"personal\",\"label\":\"L1\",\"email\":\"manish@test.com\",\"preferred\":false}],\"phones\":[{\"id\":\"139362\",\"customerId\":\"139362\",\"type\":\"personal\",\"label\":\"L1\",\"number\":\"9900990099\",\"countryCode\":\"IN\",\"areaCode\":\"91\",\"ext\":\"0\",\"preferred\":false}],\"idDocs\":[{\"id\":\"139362\",\"customerId\":\"139362\",\"type\":null,\"primary\":false,\"number\":null,\"expiry\":null,\"issuancePlace\":null,\"issuanceCountry\":null}],\"education\":\"B.E\",\"employment\":[{\"customerId\":\"\",\"employerName\":\"Ename\",\"jobTitle\":\"true\",\"occupationCode\":\"1234\",\"description\":\"2019-03-18T06:46:19.446Z\",\"industryCode\":\"4321\",\"duration\":\"1\",\"email\":\"test1@test.com\"}]}\"}";      
      //{Muthu}  String data1 = "{\"entityname\":\"biographicsdata\",\"globalid\":\"1ebcc1c1-9f35-4908-afd7-29239cde41c7\",\"customerid\":\"139362\",\"processtype\":\"createcustomer\",\"entitydata\":{\"customerid\":\"139362\",\"biographics\":{\"id\":\"139362\",\"customerid\":\"139362\",\"firstname\":\"rioifdrt\",\"middlename\":\"rioifdrt\",\"lastname\":\"rioifdrt\",\"prefix\":\"aa\",\"suffix\":\"bb\",\"gender\":\"male\",\"dob\":\"19990106\",\"placeofbirth\":\"bangalore\",\"countryofbirth\":\"us\",\"residencycountrycode\":\"us\",\"residencystatus\":\"us\",\"residencytype\":\"us\",\"nationality\":\"us\",\"maritalstatus\":\"single\"},\"addresses\":[{\"id\":\"139362\",\"customerid\":\"139362\",\"type\":\"2\",\"label\":\"l1\",\"line1\":\"street\",\"line2\":\"-\",\"line3\":\"-\",\"line4\":\"-\",\"locality\":\"karnataka\",\"region\":\"h\",\"postalcode\":\"569999\",\"country\":\"india\",\"name\":null}],\"emails\":[{\"id\":\"139362\",\"customerid\":\"139362\",\"type\":\"personal\",\"label\":\"l1\",\"email\":\"manish@test.com\",\"preferred\":false}],\"phones\":[{\"id\":\"139362\",\"customerid\":\"139362\",\"type\":\"personal\",\"label\":\"l1\",\"number\":\"9900990099\",\"countrycode\":\"in\",\"areacode\":\"91\",\"ext\":\"0\",\"preferred\":false}],\"iddocs\":[{\"id\":\"139362\",\"customerid\":\"139362\",\"type\":null,\"primary\":false,\"number\":null,\"expiry\":null,\"issuanceplace\":null,\"issuancecountry\":null}],\"education\":\"b.e\",\"employment\":[{\"customerid\":\"\",\"employername\":\"ename\",\"jobtitle\":\"true\",\"occupationcode\":\"1234\",\"description\":\"2019-03-18t06:46:19.446z\",\"industrycode\":\"4321\",\"duration\":\"1\",\"email\":\"test1\"}]}}";
        System.out.println(data1);
        
        for(int counter=0; counter < numTimes; counter++) {
        	System.out.println(data1);
        
        KafkaTemplate.send(TOPIC_NAME,data1);
         }
        
        return data1;
    }
}

///http://localhost:8888/javainuse-kafka/producer?message=test
//spring.kafka.bootstrap-servers=ec2-18-222-193-16.us-east-2.compute.amazonaws.com:9092

