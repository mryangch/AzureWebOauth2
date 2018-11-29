Azure Web OAuth2
=====================================================

This is a MVC .Net Core web app which implement OAuth2(Github Apis).

Web app is running in Azure: https://chunhaiazureweboauth.azurewebsites.net/Login

1.Use Chrome incognito window to view app.</br>
2.Navigate to appsettings.json file to set your ClientId and ClientSecret.</br>
3.Publish project to Azure.</br>
4.Test and verify project in Azure.</br>

## Referencing
1.[Authenticate with OAuth 2.0 in ASP.NET Core 2.0](https://www.jerriepelser.com/blog/authenticate-oauth-aspnet-core-2/).</br>
2.[Authorizing OAuth Apps](https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/).

## Artifacts
1.Direct to Azure web, Click Log in with GitHub.
![Screenshot](https://github.com/mryangch/AzureWebOauth2/blob/master/AzureWebOAuth2/Images/Step1.PNG)
2.Key in your GitHUb account and pwd, then click Sign In.
![alt text](https://github.com/mryangch/AzureWebOauth2/blob/master/AzureWebOAuth2/Images/Step2.PNG)
3.Callback and redirect to indicated URL where display public informations related to GitHub account.
![alt text](https://github.com/mryangch/AzureWebOauth2/blob/master/AzureWebOAuth2/Images/Step3.PNG)
