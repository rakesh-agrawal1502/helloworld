1. Create the AKS cluster
2. AKS cluster will come up with ingress controller in kube-system namespace
3. For creating k8s secret map from keyvault and to access it from the containers, execute secretproviderclass.yaml in same namespace where deployments are provisioned. This will create a secret provider class.
   kubectl get secretproviderclass
   NAME                      AGE
   azure-kvname-system-msi   78m
	
   It will also create secretmap.
   
   kubectl get secret
   NAME                  TYPE                                  DATA   AGE
   cregsecrets           Opaque                                1      6m2s
   
4. We need to deploy deployments/services like helloworld and reports in default/any custom namespace
5. We need to create secret map in the same namespace where deployments are provisioned
6. We need to execute application-ingress YAML in the same namespace deployments are provisioned
7. Access the application as: 
   - https://ip_address/hello 
   - https://ip_address/reports
8. Access the secrets as:
   kubectl exec helloworld-589ffb44f7-vt7sh -- ls /mnt/secrets-store
   mypwd

   kubectl exec helloworld-589ffb44f7-vt7sh -- cat /mnt/secrets-store/mypwd
   test@123