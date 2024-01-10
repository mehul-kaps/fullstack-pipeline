const fs = require('fs');

const artifactPath = 'target/site/jacoco';
const coverageReportPath = `${artifactPath}/index.html`;

try {
  const coverageReport = fs.readFileSync(coverageReportPath, 'utf-8');
  const commentBody = `## Jacoco JUnit Coverage Report\n\n${coverageReport}`;

  await github.rest.issues.createComment({
    owner: context.repo.owner,
    repo: context.repo.repo,
    issue_number: context.issue.number,
    body: commentBody,
  });
} catch (error) {
  console.error(`Error reading Jacoco report: ${error.message}`);
}