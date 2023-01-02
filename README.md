1. Create the AKS cluster
2. AKS cluster will come up with ingress controller in kube-system namespace
3. We need to deploy deployments/services like helloworld and reports in default/any custom namespace
4. We need to create secret map in the same workspace where services are installed
5. We need to execute application-ingress YAML in the same workspace where services are installed