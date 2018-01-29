# Shadowman Insurance Accident Alert Web Application

Red Hat Insurance Accident Alert Web Application is an HTML application secured with Red Hat Single Sign On (RH-SSO) that allows authorized entities to report accidents.

## Parameters

Template is configured with the following basic parameters:

* APPLICATION_HOSTNAME : The public hostname for the web app
* SSO_URL: Single Sign On Authorization URL
* BACKEND_URL: Backend service endpoint URL
* LIVERELOAD: Enable Live Reload to debug app
* GITHUB\_TRIGGER\_SECRET: Github trigger secret
* GENERIC\_TRIGGER\_SECRET: Generic trigger secret

## Installation

To make installation easier, we provide an openshift template to install the web application in user (e.g. "myproject") project/namespace. Follow these steps to get a running instance of the accident alert web application:

1. Install Openshift template

        oc create -f accidentalert-ui-template.json -n myproject

1. Add application to your project

        oc new-app accidentalert-ui-template -p SSO_URL=<sso_url> -p BACKEND_URL=<backend_url> -p APPLICATION_HOSTNAME=<hostname>

<!---
## Usage

Here you can write any kind of things that help others to use your project. Feel free to add as many aspects as you like. Here are just three examples:

### Build Process
If there is anyhting special about your build process or things that others have to take care of, write it down here

### Deployment
Since some projects follow a special kind of deployment, you should provide a proper description on how to deploy.

### Cronjobs
If you project is using cron jobs or any other automated scripts you should describe their functionality here.
--->

## Support & Ownership

Feel free to ask [Hugo Guerrero](hguerrer@redhat.com) if you need some support when there are any questions left or if you need some support.