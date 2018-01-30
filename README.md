## Shadowman Insurance

Shadowman Insurance Corporation is one of the largest providers of car and life insurance in the country. The company also insures motorcycles, boats, RVs and commercial vehicles, and provides home insurance through select companies. Being one of the largest auto insurers, with over 13 million policies in force. Shadowman Insurance primarily offers its services through the Internet or by phone and through partner independent insurance agents. Shadowman Insurance's Agency business sells insurance through more than 30,000 independent insurance agencies and shadowmanauto.com where customers can quote their own policies and then contact an agent to complete the sale.

To stay competitive, they decide to start the new "Digital transformation Project" by transforming their entire business and organizational activities, processes to fully leverage the digital technologies. Part of their project is expand their partner ecosystem and enhance their customer experience. 

![Insurance PoC ](docs/images/group-life-insurance-icon-blue.png)

### The Claim System

Currently Shadowman Insurance Corporation has an existing webservices that handles all the claim request from partners. Since 2 years ago, Shadowman Insurance notice increasing amount of their partner are providing mobile devices to their agents. And the time it takes for these mobile app to adopt their current webservice takes longer and takes months if updates needed to the claim system, as they need to wait for all partner system to reflect the changes. Demands for REST API is now a high priority. But it takes time for Shadowman Insurance to completely refactor their existing webservice due to the technical debt. 

![Old Claim](docs/images/old-claim.png)

### Accident alert and Claim

One partner accident customer helpdesk center collects report of the clients and report back to Shadowman daily. And would like to automate and kick off the claim process for their client. as well as allowing instant report from partner systems. Shadowman Insurance Corporation would like to integrate both Alert and Claim. As much as Shadowman Insurance's urgency to provide these capability. They were also concern about the security of the service they provide. No compromise when it comes to the safty of the client data and it's system.

![accident center](docs/images/accident-center-tobe.png)


### Microservices, Cloud Native and API

Shadowman Insurance Corporation reach out to Red Hat. Red Hat is known for having the resources and infrastructure to support the cloud-native journey from start to finish with open source tools—from platform, containers to microservices. As an proud SA of Red Hat, you will be conducting PoC for Shadowman Insurance with a partner. 

Here are some of the input from our key sponsor in Shadowman Insurance. 

- Most of our developer has been developing applications on traditional monolithic applications. Painless migration to cloud native architecture will be our primary goal.
- Flat learning curve is essential when it comes to using the technology. 
- Show us how to do microservice right! 


For this PoC, you will need to show Shadowman Insurance Corp 

- Build a brand new REST API for accident center to receive single accident report.
- Collect all accident reports from all sources and automatically file a claim.
- Converts an existing webservice to an REST API with API Standard Documentations.

![accident center](docs/images/techspark.png)

Shadowman Insurance share with you the [instructions](docs/SetupTechSparkPoCEnvironment.md) to setup their current applications in the new environment.


### API Securty

Shadowman Insurance shared the scope of work (SOW) for the PoC with the internal team and the CSO (Chief Security Officer) requested that the newly created services should be compliant with the corporate security policy. 

To be compliant, you will need to secure the services you created using, at least, a basic authentication scheme. They currently have an application using Red Hat Single Sign On to secure the Accident Alert Reporting Portal. You will need to integrate the REST service created with this portal using the secured service instead of the old legacy endpoint.

Shadowman Insurance provided you with a [realm template](templates/insurance-realm.json) you can use to mock up their security setup.

To accomplish this step, you will need to add to your PoC environment:

- Install Red Hat Single Sign On and configure the provided realm.
- Install an on-premise deployment of Red Hat 3scale API Management.
- Define and expose the REST API for accident center to receive single accident report using OpenID Connect.
- Define and expose the batch accident reports service using API Key.
- Define and expose the existing SOAP Web Service as a SOAP endpoint using API Key.