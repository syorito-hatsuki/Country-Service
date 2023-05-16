<a name="readme-top"></a>

[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![Apache 2.0][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<br />
<div align="center">
  <h3 align="center">Country-Service</h3>

  <p align="center">
    Demo project for Nordea
    <br />
    <br />
    <a href="https://github.com/syorito-hatsuki/Country-Service/blob/master/country_service-1.0.0.jar?raw=true">Download Demo</a>
    ·
    <a href="https://github.com/syorito-hatsuki/Country-Service/issues">Report Bug</a>
    ·
    <a href="https://github.com/syorito-hatsuki/Country-Service/issues">Request Feature</a>
  </p>
</div>

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## About The Project

This project for me was a test task at Nordea for the Junior Backend position.

### Task
Implement a microservice which provides a list of countries and, in addition, provides more detailed information per country.

1. Use spring-boot
2. Use maven
3. Use best practices and microservice approach
4. Implement the following REST API with spring-boot:

<details>
  <summary>GET /countries/</summary>

```json
{
  "countries": [
		{
			"name": "Finland",
			"country_code": "FI"
		}
	]
}
```
</details>

<details>
  <summary>GET /countries/{name}</summary>
	
```json
{
	"name": "Finland",
	"country_code": "FI",
	"capital": "Helsinki",
	"population": 5491817,
	"flag_file_url": "<url to the flag file>"
}
```
</details>

5. Country service must fetch the relevant information for countries from some other service
	- You could use for example the following service: https://countriesnow.space/
6. Test the implementation as well as it's needed from your perspective
7. All the implementations must be runnable locally with our own computer. Write needed instructions to README.md file.
8. Publish all sources code and relevant files in github or similar service and send the link to the repo so that the implementation can be reviewed.

- You get bonus points if:
	- you use and understand reactor (https://www.baeldung.com/reactor-core)
	- you create a separate wep application which utilizes the created REST API and shows the relevant country information in a browser
	
<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With
- [![Apache-Maven][Apache-Maven]][Apache-Maven-url] 
- [![Spring-Boot][Spring-Boot]][Spring-Boot-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Getting Started

### Prerequisites

Install java 17 or newer. Select correct away for our system
|OS|Download Away|
|-|-|
|Windows|https://adoptium.net/temurin/releases/|
|Ubuntu|`sudo apt install openjdk-17-jre`|
|Arch Linux|`sudo pacman -S jre-openjdk`|

### Installation
1. Clone the repo
   ```sh
   git clone https://github.com/syorito-hatsuki/Country-Service.git
   ```
2. Build JAR using maven
   ```sh
   ./mvnw jar:jar
   ```

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Usage

1. Run JAR file
   ```sh
   java -jar country_service-1.0.0.jar
   ```
<p align="right">(<a href="#readme-top">back to top</a>)</p>

## License

Distributed under the Apache 2.0. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Contact

Kit Lehto - [@kit-lehto][linkedin-url] - kit.lehto.d@gmail.com

Project Link: [https://github.com/syorito-hatsuki/Country-Service](https://github.com/syorito-hatsuki/Country-Service)

<p align="right">(<a href="#readme-top">back to top</a>)</p>

[contributors-shield]: https://img.shields.io/github/contributors/syorito-hatsuki/Country-Service.svg?style=for-the-badge
[contributors-url]: https://github.com/syorito-hatsuki/Country-Service/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/syorito-hatsuki/Country-Service.svg?style=for-the-badge
[forks-url]: https://github.com/syorito-hatsuki/Country-Service/network/members
[stars-shield]: https://img.shields.io/github/stars/syorito-hatsuki/Country-Service.svg?style=for-the-badge
[stars-url]: https://github.com/syorito-hatsuki/Country-Service/stargazers
[issues-shield]: https://img.shields.io/github/issues/syorito-hatsuki/Country-Service.svg?style=for-the-badge
[issues-url]: https://github.com/syorito-hatsuki/Country-Service/issues
[license-shield]: https://img.shields.io/github/license/syorito-hatsuki/Country-Service.svg?style=for-the-badge
[license-url]: https://github.com/syorito-hatsuki/Country-Service/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/kit-lehto/
[Apache-Maven]: https://img.shields.io/badge/apache%20maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white
[Apache-Maven-url]: https://maven.apache.org/
[Spring-Boot]: https://img.shields.io/badge/spring%20boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white
[Spring-Boot-url]: https://spring.io/
